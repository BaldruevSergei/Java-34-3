package homework;

import java.util.Scanner;

public class StringNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string- ");
        String stringNum = scanner.next();
        System.out.println("Input number");
        int number = scanner.nextInt();
        System.out.println("  Your string- " + stringNum + "       Your number  " + number);
        int count = number;
        while (count > 0){
            System.out.println(stringNum);
            count--;
        }



    }
}
