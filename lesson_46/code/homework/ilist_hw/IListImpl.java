package homework.ilist_hw;

import java.util.Arrays;
import java.util.Iterator;

public class IListImpl<E> implements IList<E> {

    // fields

    private Object[] elements; // массив для списка объектов
    private int size; // размер массива

    // конструктор

    public IListImpl(int initialCapasity) {
        if (initialCapasity <0) {
            throw new IllegalArgumentException("Illegal capacity  = " + initialCapasity); // выбросили исключение
        }
        elements = new Object[initialCapasity];


    }

    public  IListImpl(){
        this(10);
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }




    @Override
    public boolean add(E element) { // можем внести дубликаты
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            if (size == Integer.MAX_VALUE) { // если превысили
                throw new OutOfMemoryError(); // большего по размеру массиву создать не сможем
            }
            int newCapacity = elements.length + elements.length / 2; // вырастили длину массива в 1,5 раза
            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity); // скопируем массив себя в себя с новой длиной
        }
    }

    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление в конец спика
            add(element);
            return true;
        }
        checkIndex(index);
        ensureCapacity();
        System.arraycopy(elements, index, elements,index+1, size++ -index);
        elements[index] =element;
        return true;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E el = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, --size -index);
        elements[size] = null; // зачем-то затираем последний ?
        return el;
    }
   /* После выполнения System.arraycopy, когда элементы сдвигаются на одну позицию назад, последний элемент становится
    дублированным на предпоследней позиции. Затирание последнего элемента elements[size] = null; выполняется для очистки
    этой дублированной позиции, иначе в списке может остаться ссылка на ненужный объект, что может вызвать утечку памяти.

    Этот шаг необходим для правильной работы списка и предотвращения утечек памяти. В Java объекты не удаляются сразу после
    вызова remove, и сборка мусора может произойти позже. Поэтому затирание последнего элемента является хорошей практикой для
    избежания утечек памяти.

    */
    @Override
    public E  get(int index) {
        checkIndex(index);
        return (E) elements[index]; // (Е) - кастинг к типу
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E victim = (E) elements[index]; // Найти элемент по индкексу
        elements[index] = element;
        return victim;
    }

    /*@Override
    public E set(int index, E element) {
       checkIndex(index);
       E victim = (E) elements[index]; // Найти элемент по индкексу
        elements[index] = element;
               return victim;*/


    @Override
    public int indexOf(Object o) {
        if (o != null) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i; // вернули индекс если нашли

                }
            }
        } else { // когда в листе есть объект null
            for (int i = 0; i < size; i++) {
                if (null == (elements[i])) {
                    return i;
                }
            }


        }  return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o != null) {
            for (int i = size; i >= 0; i--) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        } else { // когда в листе есть объект null
            for (int i = 0; i < size; i++) {
                if (null == (elements[i])) {
                    return i;
                }
            }
        } return -1;
    }




    @Override
    public Iterator<E> iterator() {
         //  с какого элемента начинается перебор
        return new Iterator<E>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < size;
            }

            @Override
            public E next() {
                return (E) elements[i++];
            }
        };
    }


    public void printArr(){

    }
}
