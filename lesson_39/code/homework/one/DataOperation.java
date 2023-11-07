package homework.one;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//Задача 1. В классе DateOperation (см. package homework) реализовать метод getAge
// , принимающий дату рождения в виде String, и возвращающий возраст в годах.
public class DataOperation {
    public static void main(String[] args) {
        System.out.println("Enter you birth day (year.month.day)");

        Scanner scanner = new Scanner(System.in);
        String birthDate = scanner.next();
        System.out.println(" You are - " + getAge1(birthDate) + "  years old");

    }

    public static int getAge(String birthDate) {
         LocalDate CurrentDate = LocalDate.now();
         LocalDate birthDateTime = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
         int age =CurrentDate.getYear() - birthDateTime.getYear();
         return (int) age;
     }
    public static int getAge1(String birthDate) {
        //TODO
        LocalDate date = LocalDate.parse(birthDate);
        System.out.println(date);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        long age = ChronoUnit.YEARS.between(date, currentDate);
        System.out.println(age);
        int res = (int) age;
        return res;
    }




}

