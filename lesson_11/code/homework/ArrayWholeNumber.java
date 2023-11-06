package homework;

public class ArrayWholeNumber {
    public static void main(String[] args) {
        int[] ramdomInt = new int[10];

        int a = -10;
        int b = 10;
        double sum = 0;
           for (int i = 0; i < ramdomInt.length; i++) {
            ramdomInt[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(ramdomInt[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < ramdomInt.length; i++) {
               if ((ramdomInt[i]) % 2 != 0) {
                   System.out.print(ramdomInt[i] + "  ");
                   sum = (Math.abs(ramdomInt[i])) + Math.abs(sum);
            }
        }

            System.out.println();
            System.out.print("Summ all odd-count  numbers = " + sum);


        }


    }