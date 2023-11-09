package practice.complexity;

import java.util.Arrays;

public class ComplexityAppl {
    public static void main(String[] args) {
        // заведем массив
        // будем проводить оценку сложности алгоритма (вычесление среднего, сложение элементов, поиск элементов, поиск минунимум и макс, сортировка )

        // оценим вычеслительную сложность алгоритма

        int[] arr = {-24, 7, -67, 15, 8, 93, 1};

        // вычисление среднего значения :
        /*
        - узнать длину массива
        - в цикле складываем элементы
        - сумму делим на кол-во элементов
         */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // здесь растет кол-во операций

        }
        double avg = (double) sum / arr.length; // кастинг в другой тип данных
        System.out.println(avg);

        //  что будет происходить при росте кол-ва элементов массива
        // это линейная сложность  - так ка ккол-во операций прямопрорционально кол-ву элементов массива
        // O(n) -  это вычислительная сложность данного

        // поиск элемента массива
        // - если идем по массиву
        // - если пробегаем по массиву, то сложность линейная  O(n)
        // если бинарный поиск
       // Arrays.sort(arr); // сортируем целые числа -  оценим  отдельно

        /*System.out.println(Arrays.toString(arr));
        System.out.println("----------------------");
        int index = Arrays.binarySearch(arr,-67);
        System.out.println(index);

        int index1 = Arrays.binarySearch(arr,93);
        System.out.println(index1);
        int index2 = Arrays.binarySearch(arr,100);
        System.out.println(index2);*/

        // при 8 элементов - 3 итерации деления массива
        // при 16 элементов - 4 итерации
        // ...
        // 1024 элементов  - 10 итераций
        // 2048 элементов - 11 итераций
        // O(log(n)) - это логарифмическая сложность (самая низкая!)

        // сортировка методом BabbleSort сравнивает по 2 элемента i - текущий и i+1 последующий
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                 int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;// переставим элементы местами
                }
            }


        }
        System.out.println(Arrays.toString(arr));

        // это квадратичнсая сложность O(n^2)

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // сложность в методе sort

    }

}
