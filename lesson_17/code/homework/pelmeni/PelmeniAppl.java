package homework.pelmeni;

import homework.pelmeni.eat.Pelmeni;

public class PelmeniAppl {
    public static void main(String[] args) {
        int[] x = new int[30];
        int a = 25;
        int b = 35;
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * (b - a + 1) + a);
            }

        Pelmeni.printArray(x);
        System.out.println();
        int s =Pelmeni.Enter();
        Pelmeni.NewArray(x,s);
        Pelmeni.split();
        Pelmeni.printArray(x);



    }
}
