package homework;

public class ArrayTheSgueeledNumbers {
    public static void main(String[] args) {
        int[] ramdomInt = new int[10];

        int a = -10;
        int b = 10;
        int sum = 1;

        for (int i = 0; i < ramdomInt.length; i++) {
            ramdomInt[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(ramdomInt[i] + "  ");

        }
        System.out.println();

        for (int i = 0; i < ramdomInt.length; i++) {

           if (i % 2 == 0) {
               sum = sum * Math.abs(ramdomInt[i]);
               System.out.print(ramdomInt[i] + " * ");
           }
        }

            System.out.print("  = " + sum);
}}
