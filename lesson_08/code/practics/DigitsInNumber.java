package practics;

import java.util.Scanner;

// Задача 4. Пользователь вводит натуральное число (целое, положительное).
// Выясните, сколько цифр в числе.
public class DigitsInNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input posiriv integer number");
        int number = scanner.nextInt();
        System.out.println("Your number is " + number);

        // составляем алгоритм

        // смысл цифры в числе определяется положением 1 2 3 4..

        // делим в цикле наше число на 10 пока больше 0
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Digitts in number "  + "  is  " + count);
    }
}
