package homework;

import java.util.Scanner;

public class NumberPlus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("  Enter your pozitiv number " );
        int number = scanner.nextInt();
        System.out.println( " Your number  is   " +number );
        int sum = 0;
        int count = 0;

        while (number > 0){
            sum = (sum + number % 10);
            number = number / 10;

        }
        System.out.println("Sum = " + sum);
    }
}
