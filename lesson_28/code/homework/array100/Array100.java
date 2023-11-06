package homework.array100;

public class Array100 {


    //Задача 2. Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
//
//положительных чисел;
//отрицательных чисел;
//четных чисел;
//нулей.
 //   int[] myArray = new int[100]; // объявляем массив
 //   int a = -10;
 //   int b = 10;


   // public static void fullArray(int[] arr, int a, int b) {
   //     for (int i = 0; i < arr.length; i++) {  // обходим, пробегаем все элементы массива
   //         arr[i] = (int) (Math.random() * (b - a + 1) + a); // в элемент массива кладем случайное целое число
   //     }
  //  }

    public int arraySerchPozitiv(int[] arr) {  //ищем сколько положительных чисел;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                s++;
            }


        }
        return s;
    }

    public int arraySerchNegativ(int[] arr) {  //ищем сколько отриу чисел;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                s++;
            }


        }
        return s;
    }

    public int arraySerchDigit(int[] arr) {  //ищем сколько четных чисел;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %  2 == 0) {
                s++;
            }


        }
        return s;
    }

    public int arraySerchNoDigit(int[] arr) {  //ищем сколько нечетных чисел;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] % 2 != 0)&&(arr[i]!=0)) {
                s++;
            }


        }
        return s;
    }

}


