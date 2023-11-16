package practice.linked_list;

public interface NodeList<E>  extends Iterable<E> {
    // прописываем методы

    int size();// размер  листа

   default boolean isEmpty(){
       return size() == 0;
   }

   boolean add(E element); // добавление

   void clear(); // зачистка

    default boolean contains(Object o){
        return indexOf(o) >= 0; // есть ли такйо объект в списке по индексу
    }

    default boolean remove(Object o) {
       int index = indexOf(o);
       if (index < 0) {
           return false;
       }
       remove(index);
        return true;
    }

    boolean add(int index, E element);
    E get(int index);

    int indexOf(Object o); // определение индекса элемента в листе

    int lastIndexOf(Object o);

    E remove(int index);
    E set(int index, E element);






}
