package homework.equation.model;

public class QuadraticEquation {
    double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void display(){
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
    public  double delta(double a, double b, double c){
        double D = 1;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
        return D;

    }
    //public int quantityRoots(){
    public  double quantityRoots(double a, double b, double c){
        double D = 1;
        D = b * b - 4 * a * c;
        System.out.println("discriminant = " + D);
        return D;
    }



    }

    //}


