package practice.linked_list;

import java.util.Iterator;

public class NodeListImpl <E> implements NodeList<E>{
   // fields
   private Node<E> first;
   private Node<E> last;

   private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E element) { // добавляем элемент в список
        Node<E> newNode = new Node<>(last, element, null); // создаем новый он последний
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode; // если список был пусто, то новый создаваемый становится первый
        }
        last = newNode;
        size++;
        return true;
        // узел новый, следующий,  в конец списка
    }

    @Override
    public void clear() {
        first = last = null; // можем одновременно присвоить нули
        size = 0;

// TODO
    }

    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление элемента в конец
            return add(element);
        }
        Node<E> node = getNodeByIndex(index); // берем узел по его индексу
        Node<E> newNode = new Node<>(node.prev, element, node); // создаем новый узел для вставки в спиок середину
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode; // вставка в начало списка
        }
        size++;
        return true;
    }
    // разобраться как работает метод
    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
        
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }


    @Override
    public E get(int index) {
        Node<E> node = getNodeByIndex(index);
        return node.data;
    }


    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o != null) { // внутри узла не null и он есть
            for (Node<E> node = first; node != null; node = node.next, index++) {// цикл который перебирает узлы
                if (o.equals(node.data)) {
                    return index;
                }
            }
        } else {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o == node.data) { // null можно сравнивать через ==
                    return index;
                }
            }
        }
        return -1; // объект о не найден  в списке
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = 0;
        if (o != null) { // внутри узла не null и он есть
            for (Node<E> node = first; node != null; node = node.next, index++) {// цикл который перебирает узлы
                if (o.equals(node.data)) {
                    return index;
                }
            }
        } else {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o == node.data) { // null можно сравнивать через ==
                    return index;
                }
            }
        }
        return -1; // объект о не найден  в списке
    }// TODO

    @Override
    public E remove(int index) {
        Node<E> node = getNodeByIndex(index);
        return unlink(node);

    }

    private E unlink(Node<E> node) {
        E victim = node.data;
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if (prev != null) {
            prev.next = next;
            node.prev = null;
        } else {
            first = next;
        }
        if (next != null) {
            next.prev = prev;
            node.next = null;
        } else {
            last = prev;
        }
        node.data = null;
        size--;
        return victim;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = getNodeByIndex(index);
        E victim = node.data;
        node.data = element;
        return victim;

    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            Node<E>  current = first;
            @Override
            public boolean hasNext() {

                return current != null;
            }

            @Override
            public E next() {
                E data = current.data;
                current = current.next;
                return data;
            }
        };

    }
}

    // fields
