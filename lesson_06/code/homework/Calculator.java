package homework;

import java.util.Scanner;

//Задача 3.(*) Написать приложение - калькулятор для работы с целыми числами: oper == 1 => +, oper == 2 => -,
// oper == 3 => *, oper == 4 => /, oper == 5 => % , other print "Wrong operation"
public class Calculator {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Inter 1-st number (from 1 to 10)");
        int a = scaner.nextInt();
        System.out.println("Inter 2-st number (from 1 to 10)");
        int b = scaner.nextInt();
        System.out.println("Inter operation (1 +   2 -   3 *   4 /    5 %)");
        int operation = scaner.nextInt();
        int result = 0;

        switch (operation) {
            case (1): {
                result = a + b;
                System.out.println( + a + "+" + b + "= " + result);
            }
            break;
            case (2): {
                result = a - b;
                System.out.println( +a + "-" + b + "= " + result);
                break;
            }
            case (3): {
                result = a * b;
                System.out.println(  +a +  "*" + b + "= " + result);
                break;
            }
            case (4): {
                result = a / b;
                System.out.println( +a +  "/" + b + "= " + result);
                break;
            }
            case (5): {
                result = a % b;
                System.out.println( + a + "%" + b + "= " + result);
                break;
            }
            default: {
                System.out.println("Your number wrong");
            }
        }

    }
}
