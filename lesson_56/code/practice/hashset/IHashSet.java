package practice.hashset;

import java.util.Iterator;
import java.util.LinkedList;

public class IHashSet<E> implements ISet<E> {
    // fields

    private LinkedList<E>[] hashset; // this massiv form связных листов
    // каждый элемент массива - это отдельный LinkedList
    private  int size;
    private int capacity; // кол-во гвоздей на которых будут висеть грозди
    private  double loadFactor; // объем загрузеи

    public IHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashset = new LinkedList[capacity]; // это массив из LinkedList
    }
    //  в этом кострукторк можно определить свой loadFactor
    public  IHashSet(int capacity){
        this(capacity,0.75);// 0.75 loadFactor
    }
    public IHashSet(){
        this(16,0.75);

    }

    @Override
    public boolean add(E element) {
        if (size >= capacity * loadFactor) {
            rebuildArray();
        }
        int index = getIndex(element);
        if (hashset[index] == null) {
            hashset[index] = new LinkedList<>();
        }
        if (hashset[index].contains(element) ){
            return false; // следим за уникальностью элементов
        }
        hashset[index].add(element);
        size++;

        return true;
    }
    private void rebuildArray(){
        capacity = capacity * 2;
        LinkedList<E>[] newHashSet = new LinkedList[capacity]; // расширили ширину
        // обегаем всеь HashSet , залесть в каждый его LinkedList, переложить элементы в новый

        for (int i = 0; i < hashset.length; i++) {
            if (hashset[i] != null) {
                for ( E e: hashset[i]) {
                    int index = getIndex(e);
                    if (newHashSet[index] == null){
                        newHashSet[index] = new LinkedList<>(); // создаем новый лист
                    }
                    newHashSet[index].add(e); // добавляет элемент в LinkedList

                }

            }
        }
        hashset = newHashSet; // переопределили ссылку, garbage colletcor очистит память
    }

    private int getIndex(E element) {
        int hashcode = element.hashCode(); // высчесляем hashcode элемента
        hashcode = hashcode >=0 ? hashcode : -hashcode;
        return hashcode % capacity; // деление с остатком

    }

    @Override
    public boolean contains(E element) {
        int index = getIndex(element);
        if (hashset[index] == null) {
            return false;
        }
        return hashset[index].contains(element);  // проверяем наличие элемента  ;
    }

    @Override
    public boolean remove(E element) {
        int index =getIndex(element);
        if (hashset[index] == null) {
            return false;
        }
        boolean res = hashset[index].remove(element);
        if (res) {
            size--;
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {


        return new Iterator<E>() {
            int i;
            int j;
            int totalCounter;
            @Override
            public boolean hasNext() {
                return totalCounter < size;
            }

            @Override
            public E next() {
                while (hashset[i] == null || hashset[i].isEmpty()) { // если внутри рядом пустота
                    i++; // переходим к следующему
                }
                E res = hashset[i].get(j);
                totalCounter++;
                if (j < hashset[i].size() - 1) { // находимся внутри LinkedList
                    j++;
                } else {
                    j= 0;
                    i++; // перешли к следующему
                }
                return res;
            }
        };
    }
}
