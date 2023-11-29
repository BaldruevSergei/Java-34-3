package homework.twolist;

import java.util.*;

//Задача 4. (*) Даны два списка неуникальных целых чисел или слов. Посчитайте,
// сколько уникальных элементов содержится одновременно, как в первом, так и во втором списке.
public class TwoList {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int a = 1;
        int b = 10;

        Random random = new Random();// вызываем рандом
        // заполнили множество  1 (лист 1)
        Set<Integer> list1 = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            list1.add(numbers[i] = random.nextInt(b) + a);
        }
        // распечатали множество (лист 1)

        System.out.println();
        System.out.println("List 1");
        for (Integer o : numbers) {
            System.out.print(o + " | ");

        }
        System.out.println();
        System.out.println("------------------------------");


        // заполнили множество 2 (лист 2)
        Set<Integer> list2 = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            list2.add(numbers[i] = random.nextInt(b) + a);
        }
        // распечатали  множество 2 (лист 2)
        System.out.println("List 2");
        for (Integer o : numbers) {
            System.out.print(o + " | ");
        }

        // Создаем множество для пересечения
        Set<Integer> commonElements = new HashSet<>(list1);
        commonElements.retainAll(list2);

        // Печатаем  количество уникальных элементов в пересечении
        System.out.println();
        System.out.println("количество уникальных элементов = " + commonElements.size());
        System.out.println("уникальные элементы = " + commonElements);
    }
}










