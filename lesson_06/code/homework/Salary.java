package homework;

import java.util.Scanner;

// Задача 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%. Сколько лет проработал работник вводится с клавиатуры.
public class Salary {
    public static void main(String[] args) {
        double baseSalary = 500; // базовый оклад
        double newSalary = baseSalary; // новый оклад
        Scanner scanner = new Scanner(System.in); // ввод данных
        System.out.println("Input your Experience");
        int stage = scanner.nextInt();

        switch(stage) {
            case 3: {
                newSalary = baseSalary + baseSalary * 0.1;
                System.out.println("Your salary = " + newSalary);
                break;
            }
            case 5: {
                newSalary = baseSalary + baseSalary * 0.5;
                System.out.println("Your salary = " + newSalary);
                break;
            }
            case 10: {

                newSalary = baseSalary + baseSalary;
                System.out.println("Your salary = " + newSalary);
                break;
            }
            case 15: {
                newSalary = baseSalary + baseSalary * 1.5;
                System.out.println("Your salary = " + newSalary);
                break;
            }
            default: {
                System.out.println("Your salary wrong");
            }
        }
    }
}
