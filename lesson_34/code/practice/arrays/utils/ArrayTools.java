package practice.arrays.utils;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("=====================================");
    }

    public static <T> int search(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }

        }
        return -1;


    }

    // дженерик проверяет  условие на стадии компиляции (соотвествие типов )
    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }

        }
        return null;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
    public class OddEvenComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer n1, Integer n2) {
            if ((n1 % 2) != (n2 % 2)) {
                return (n1 % 2) - (n2 % 2);
            }
            if (n1 % 2 == 0) {
                return n1 - n2;
            }
            if ((n1 % 2) == 1) {
                return n2 - n1;
            }
            return 0;
        }
    }


}