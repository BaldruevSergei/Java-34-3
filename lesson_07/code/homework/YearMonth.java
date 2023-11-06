package homework;

import java.util.Scanner;

// Задача 3.(*) Написать программу, которая принимает с клавиатуры номер месяца и год и выводит
// на экран название месяца и количество дней в нем.
public class YearMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter montn please from 1 to 12 (example - 11 ) ");
        int month = scanner.nextInt();
        System.out.println("Enter year (example- 1999 ) ");
        int year = scanner.nextInt();
        int ost = year % 4;
        int ost2 = year % 100;
        int ost3 = year / 400;
        int ost4 = year % 1000;
        switch (month){
            case 1 -> System.out.println("Now month - JANUARY" );
            case 2 -> System.out.println("Now month- FEBRUARY"  );
            case 3 -> System.out.println("Now month- MARCH" );
            case 4 -> System.out.println("Now month- APRIL"  );
            case 5 -> System.out.println("Now month- MAY"  );
            case 6 -> System.out.println("Now month- JUNE" );
            case 7 -> System.out.println("Now month- JULY" );
            case 8 -> System.out.println("Now month- AUGUST" );
            case 9 -> System.out.println("Now month- SEPTEMBER" );
            case 10 -> System.out.println("Now month- OCTOBER" );
            case 11 -> System.out.println("Now month- NOVEMBER" );
            case 12 -> System.out.println("Now month- DECEMBER" );
            default -> System.out.println("Wrong month");
        }
        if ((((ost == 0) & (ost2 != 0)) |  (ost2 == 0 ) & (ost3 == 0)) | (ost4 == 0)) {
            System.out.println("Leap year number of days  - 366");
        }
        else {
            System.out.println("The year is not Leap  number of days  - 365");
        }

    }

}
