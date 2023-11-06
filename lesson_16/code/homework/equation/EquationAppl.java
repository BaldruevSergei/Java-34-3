package homework.equation;

import homework.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        int [] x = new int[3];
        int a = -100;
        int b = 100;
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * (b - a + 1) + a);

        }


        QuadraticEquation s = new QuadraticEquation(x[0], x[1], x[2]);
        System.out.println();

        s.display();
        s.quantityRoots(x[0],x[1],x[2]);
        s.delta(x[0],x[1],x[2]);


    }

}
