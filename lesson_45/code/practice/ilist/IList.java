package practice.ilist;

// зададим абстрактные методы для работы со структурой данных "лист/ list" (список чего то)
// для любых типов данных   Integar, String, StringBuilder, Employee, Car, Pet, Photo, Book ....
public interface IList <E> extends Iterable<E>{

    int size (); // узнать размер списка

    default boolean isEmpty() // если он пустой или он не пустой
    {
        return size() == 0;
    }

    void clean(); // удалить все из списка


    boolean add(E element);// добавить элемент списка

    default boolean contains(Object o)// есть ли  элемент в списке
    {
        return indexOf(o) >= 0;
    }

    default boolean remove(Object o) // удалить элемент, из списка по его индексу , если он есть
    {
        int index = indexOf(o);
        if (index < 0) {
            return false;
        }
        remove(index); // удалили индекс и объект пропал
        return true;
    }

    boolean add(int index, E element); // добавить (вставить) элемент по индексу

    E remove(int index); // удалить элемент из списка по индексу


    E get (int index); // обновить элемент в списке по его индексу

    E set (int index, E element); // получить  элемент по его индексу

    int indexOf(Object o);// зная элемент, найти его индекс

    int lastIndexOf(Object o);  // ищем  индекс элемента с конца списка


    void print(Object[] arr);
}
