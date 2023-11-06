package homework;

import java.util.Scanner;

// Задача 2. Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает, какому времени
// года принадлежит введенный месяц.
public class TimeOfYear {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Inter month (from 1 to 12)");
        int month = scaner.nextInt();
        switch (month) {
            case (1), (2), (12): {
                System.out.println("Now WINTER");
                break;
            }
            case (3), (4), (5): {
                System.out.println("Now SPRING");
                break;
            }
            case (6), (7), (8): {
                System.out.println("Now SUMMER");
                break;
            }
            case (9), (10), (11): {
                System.out.println("Now FALL");
                break;
            }
            default: {
                System.out.println("Your month wrong");
            }
        }
    }
}




