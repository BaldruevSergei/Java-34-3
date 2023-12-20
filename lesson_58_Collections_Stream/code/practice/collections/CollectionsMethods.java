package practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//// Создайте список известных вам фруктов.
//        // Выполните поиск имеющегося и отсутствующего элемента списка.
//        // Отсортируйте этот список по алфавиту в прямом и обратном порядке.
//        // Проверьте работу методов
//        // max(Collection<?> coll)
//        // min(Collection<?> coll), что они возвращают?
public class CollectionsMethods {
    public static void main(String[] args) {


        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("plum");
        fruits.add("strawberry");
        fruits.add("strawberry");

        System.out.println("---------------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("---------------------");

        Collections.sort(fruits); // сортировка  по String compareTo
        System.out.println("---------------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("---------------------");
        String key = "banana";
        int index =  Collections.binarySearch(fruits,key); // возвращает индекс
        System.out.println(" index = " + index + " of  " + key);
        // ищем отсуствующий элемент в нашем листе
        key = "kiwi";
        index =  Collections.binarySearch(fruits,key); // возвращает индекс
        System.out.println(" index = " + index + " of  " + key);

        Comparator<String> fComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2); // знак - от большего к меньшему (сортировка в обратном порядке)
            }
        };

        Collections.sort(fruits,fComparator);
        System.out.println("---------------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("---------------------");

        // реверс
        Collections.reverse(fruits);
        System.out.println("---------------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("---------------------");

        String max = Collections.max(fruits);
        System.out.println("Max of = " +  max);
        System.out.println("---------------------");

        String min = Collections.min(fruits);
        System.out.println("Max of = " +  min);

        Collections.reverse(fruits);
        System.out.println("---------------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("---------------------");

        max = Collections.max(fruits);
        System.out.println("Max of = " +  max);
        System.out.println("---------------------");

        min = Collections.min(fruits);
        System.out.println("Mix of = " +  min);
    }


}
