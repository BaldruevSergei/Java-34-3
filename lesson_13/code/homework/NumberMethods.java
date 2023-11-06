package homework;

import java.util.Scanner;

public class NumberMethods {


    // считаем число
    public static double Sum(int m) {
        double a = 1;
        for (int i = 0; i < m; i++) {
            a = a + a / m;
        }
        return (double) a;
    }


    public static void print(int n) {
        System.out.println(n);
        System.out.println();
    }
  // Метод для Задача 2. Вводится n - натуральное число. Напишите метод, который получает на вход n и
  // вычисляет n! = 1 * 2 * 3 *... * n. Вызовите полученный метод. При каком значении n
  // происходит переполнение памяти, выделяемой для n типа int? Использовать цикл for.
    public static  int FillingIn(int n){
        int a = 1;
        for (int i = 1; i <= n; i++) {
            if (a > 0) {
                a = a * i;
            }}
            return a;
        }

    public static int FillingNumbe(int n){
        int a= 1;
        int q = 0;
        for (int i = 1; i <= n-1; i++) {
            if (a > 0){
                a = a * i;
                q++;
            }
            else break;
        }
        return  q;
    }

}







