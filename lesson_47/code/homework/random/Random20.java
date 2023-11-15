package homework.random;

import java.util.ArrayList;
import java.util.List;

public class Random20 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();

        int b = 10;
        int a = 1;
        int n = 0;

        // заполнение
        ArrayList<Integer> list = null;
        for (int i = 0; i < 20; i++) {
            n = (int) (Math.random() * (b - a + 1) + a);
            randomNumbers.add(n);
            list = new ArrayList<>();
        }

        // печать
        System.out.println("========= Array with duplicate ============== ");
        for (Integer num : randomNumbers) {
            System.out.print(num + " | ");
        }

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println();
        System.out.println("========= Array with out  duplicate ============== ");
        for (Integer num : newList) {
            System.out.print(num + " | ");
        }
        // удаление дубликатов


    }

    /*public static ArrayList<Integer> removeDuplicates(List<Integer> randomNumbers) {
        // Создаем другой ArrayList.

        List<Integer> newList = new ArrayList<>();
        // Traverse through the first list
        for (Integer list : randomNumbers) {

            // Идем по первому arraylist и сохраним первое появление каждого элемента во втором arraylist, используя метод contains().
            if (!newList.contains(list)) {

                newList.add(list);
            }
        }*/





    public static <T> ArrayList removeDuplicates(ArrayList<T>list) {

        // Создаем другой ArrayList.
        ArrayList<T> newList = new ArrayList<T>();


        // Traverse through the first list
        for (T element : list) {

            // Идем по первому arraylist и сохраним первое появление каждого элемента во втором arraylist, используя метод contains().
            if (!newList.contains(element)) {

                newList.add(element);

            }
        }

        // Получаем ArrayList с повторяющимися значениями.
        return newList;
    }
}
