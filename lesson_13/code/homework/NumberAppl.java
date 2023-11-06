package homework;
//Задача 1. Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
// Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Использовать цикл for.
import java.util.Scanner;

public class NumberAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number  ");
        int n = scanner.nextInt();
        NumberMethods.print(n);
        double X = NumberMethods.Sum(n);
        NumberMethods.Sum(n);
        System.out.println(" Summ = " + X);


        //Задача 2. Вводится n - натуральное число. Напишите метод, который получает на вход n и
// вычисляет n! = 1 * 2 * 3 *... * n. Вызовите полученный метод. При каком значении n
// происходит переполнение памяти, выделяемой для n типа int? Использовать цикл for.


        System.out.println(" Enter number  ");
        int r = scanner.nextInt();
        NumberMethods.print(r);
        int x = NumberMethods.FillingIn(r);
        System.out.println("Your Faktorial = " + x);
        int y = NumberMethods.FillingNumbe(r);
        System.out.println("Memory full Your Faktorial for number n = " +y);


    }
}
