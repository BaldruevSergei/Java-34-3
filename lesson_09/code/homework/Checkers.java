package homework;

public class Checkers {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int m = 1;
        int n = 1;
        int coint = 1;
        while (n < 9) {
            if (coint % 2 == 0) {
                while (m <= 4) {
                    System.out.print(b);
                    System.out.print(" ");
                    System.out.print(a);
                    System.out.print(" ");
                    m++;
                }
            }
            if (coint % 2 > 0) {
                while (m <= 4) {
                    System.out.print(a);
                    System.out.print(" ");
                    System.out.print(b);
                    System.out.print(" ");
                    m++;
                }}
            coint++;
            System.out.println();
            m = 1;
            n++;
        }
    }
    }

