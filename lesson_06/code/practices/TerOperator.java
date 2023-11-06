package practices;

import java.util.Scanner;

//Задание 1. В программе задаются два целых числа.
// Найдите минимальное из них с помощью тернарного оператора.
// Дополните программу возможностью ввода чисел пользователем.
public class TerOperator {
    public static void main(String[] args) {
        int a = 123;
        int b = 745;

        Scanner scanner = new Scanner(System.in);// включает считывание с клавиатур
        System.out.println("Input first number"); // приглашение пользователю для ввода числа
        int number1 = scanner.nextInt(); // получение числа с клавиатуры
        System.out.println("Input second number"); // приглашение пользователю для ввода числа
        int number2 = scanner.nextInt(); // получение числа с клавиатуры

        int isMin = (a < b) ? a : b;

        int isMin2 = (number1 < number2) ? number1 : number2;

        System.out.println("Minimum= " + isMin);

        System.out.println("Minimum 2= " + isMin2);
    }
}

