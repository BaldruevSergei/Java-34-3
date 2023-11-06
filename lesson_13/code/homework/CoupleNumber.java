package homework;

import java.util.Scanner;

//Задача 4. Ввести с клавиатуры 10 пар целых чисел. Сравните числа в каждой паре и напечатайте большие из них.
// Использовать цикл for.
public class CoupleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Attemp = " + (i +1));
            System.out.println("Input 1st number");
            int a1 = scanner.nextInt();
            System.out.println("Input 2st number");
            int a2 = scanner.nextInt();


    }
}}
