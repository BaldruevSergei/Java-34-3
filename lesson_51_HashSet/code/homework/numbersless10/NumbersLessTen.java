package homework.numbersless10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Задача 2. Написать программу, которая:
//
//прочитает с клавиатуры количество вводимых чисел,
//прочитает с клавиатуры сами числа и соберёт их в множество,
//удалить из множества числа большие 10 и выведет полученные результаты на экран.
// Все числа, которые подаются на вход программы, целые.
public class NumbersLessTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input quantity digits");
        int n = scanner.nextInt();
        int i = 0;
        Set<Integer> digits = new HashSet<>();
        while (i != n) {
            System.out.println("Input number ");
            int m = scanner.nextInt();
            digits.add(m);
            i++;
        }
        System.out.println(" This digits before delete less 10  "+ digits);
        remove(digits);
        System.out.println();
        System.out.println(" This digits after delete less 10  "+ digits);
    }

    public static void remove(Set<Integer> ints) { // метод удаления чисел больше 10
        ints.removeIf(x -> (x > 10));


    }
}




