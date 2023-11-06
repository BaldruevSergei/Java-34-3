package homework;

import java.util.Scanner;

public class RamdomNumbers {
    public static void main(String[] args) {

        int[] ramdomInt = new int[10];

       int a = -20;
       int b = 20;
       for (int i = 0; i < ramdomInt.length; i++) {
            ramdomInt[i] = (int) (Math. random() * (b - a + 1) + a);

            }
        for (int i = 0; i < ramdomInt.length; i++) {
            System.out.print(ramdomInt[i] + "  ");

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:  ");
        int num = scanner.nextInt();

        boolean isInArray = searchInArray(ramdomInt , num);
        if (isInArray){
            System.out.println("Number " + num + "present in array");
        } else {
            System.out.println("Number " + num + "Dus NOT p in array");
        }

    }
    public static boolean searchInArray(int[] arr, int n){
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                res = true;
            }

        }
        return  res;
    }
}
