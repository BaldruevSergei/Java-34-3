package homework.landsofgermany;
//Задача 1. Написать программу, которая:
//
//прочитает с клавиатуры количество вводимых названий земель в Германии,
//прочитает с клавиатуры названия земель и соберёт их в множество,
//выведет полученные результаты на экран.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LandsOfGermany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input capacity lands of Germany ");
        int a = 0;
        try {
             while (a == 0) {
                   a = scanner.nextInt(); // защита от неправильного ввода
                   scanner.nextLine();
                   Set<String> germanyLands = new HashSet<>();
                   for (int i = 0; i < a; i++) {
                       System.out.println("Input name : ");
                       System.out.println();
                       String land = scanner.nextLine();
                       germanyLands.add(land);
                   }
                   for (String n : germanyLands) {


                   }
                 System.out.println(" lands of Germany " + germanyLands);
               }
               } catch (Exception d) {
             System.out.println("Wrong number ");
           }
       }
    }












