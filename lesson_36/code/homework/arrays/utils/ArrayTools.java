package homework.arrays.utils;

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
   //public static void bubbleSort(int[] arr) {
    //        for (int i = 0; i < arr.length - 1; i++) {
    //            for (int j = 0; j < arr.length - 1 - i; j++) {
    //                if (arr[j] > arr[j + 1]) {
    //                    int tmp = arr[j];
    //                    arr[j] = arr[j + 1];
    //                    arr[j + 1] = tmp;
    //                }
    //            }
    //        }

    public static <T extends  Comparable<T>>  void binarySearchCompare(T[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
     //       if (arr[mid].compareTo() == num) {
       //         return mid;
       //     } else if (num < arr[mid]) {
                right = mid - 1;
        //    } else {
                left = mid + 1;
            }
        }
      //  return -left - 1; // возвращаем отрицательное число, если элемент не найден
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
//В класс ArrayTools из урока 34, добавит два перегруженных метода бинарного поиска,
// для работы с Comparable элементами массива, и для работы с Comparator.


