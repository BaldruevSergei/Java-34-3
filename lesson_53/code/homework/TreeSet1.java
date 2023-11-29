package homework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {


        // Создаем TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Добавляем 10 числовых элементов
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(9);
        treeSet.add(4);

        // Выводим элементы TreeSet
        System.out.println("TreeSet: " + treeSet);
        TreeSet<Integer> clontreeSet = (TreeSet<Integer>) treeSet.clone();
        System.out.println("clontreeSet "+ clontreeSet);

        Iterator<Integer> desthreeSet = treeSet.descendingIterator();
        while (desthreeSet.hasNext()){
            System.out.print(desthreeSet.next() + " ");
        }
        System.out.println(treeSet.contains(8));



    }
}

