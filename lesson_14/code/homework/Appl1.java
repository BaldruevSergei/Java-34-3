package homework;

public class Appl1 {
    public static void main(String[] args) {
        int[] x = new int[30];
        int a = 0;
        int b = 100;
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        ArrayMethods1.print(x);
        ArrayMethods1.bubbleSort(x);
        ArrayMethods1.print(x);
        ArrayMethods1.sortArray(x);
        ArrayMethods1.print(x);





    }   }


