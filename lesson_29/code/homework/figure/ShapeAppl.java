package homework.figure;

import homework.figure.shape.Circle;
import homework.figure.shape.Shape;
import homework.figure.shape.Square;
import homework.figure.shape.Triangle;

public class ShapeAppl {
    public static void main(String[] args) {
        Shape[] sn = new Shape[4];

        sn[0] = new Circle(1, 10);
        sn[1] = new Circle(2, 15);
        sn[2] = new Triangle(3, 6);
        sn[3] = new Square(2, 20);

        double total = totalArea(sn);
        System.out.println("Total Area = " + total);
        double perimetr = totalPerimetr(sn);
        System.out.println("Total perimetr = " + perimetr);
        double total2  = totalArea1(sn);
        System.out.println("Total Area of  only Circle = " + total2);

    }

    private static double totalArea(Shape[] sn) {
        double sumArea = 0;
        for (int i = 0; i < sn.length; i++) {
            sumArea += sn[i].calcArea();

        }
        return sumArea;

    }

    private static double totalPerimetr(Shape[] sn) {
        double sumPerimetr = 0;
        for (int i = 0; i < sn.length; i++) {
            sumPerimetr += sn[i].calPerimeter();

        }
        return sumPerimetr;

    }

    private static double totalArea1(Shape[] sn) {
        double sumArea = 0;
        for (int i = 0; i < sn.length; i++) {
            if (sn[i] instanceof Circle) {
                sumArea += sn[i].calcArea();
            }
        }
        return sumArea;

    }
}
