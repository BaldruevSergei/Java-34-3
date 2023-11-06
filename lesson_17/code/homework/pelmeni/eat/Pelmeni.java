package homework.pelmeni.eat;

import java.util.Scanner;

public class Pelmeni {
//


//  метод - выбор счастливого пельменя
    public static int Enter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите номер счастливого пельменя  (от 1 до 30 )");
        int s = scanner.nextInt();
        return s;
    }

 // метод - число счастивого пельменя присваеваем индекс пельменя и добавляем 15
    public  static int[] NewArray(int[] arr, int a) {
            for (int i = 0; i <= arr.length; i++) {
            if ( i+1 == a) {
                arr[i] = arr[i] + 15;
            }
        }
        return arr;
    }

    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void split(){

        System.out.println("-------------------------------");
    }

}





