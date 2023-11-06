package homework.figure.shape;

public class Circle extends  Shape{
    private double radius;

    public Circle(double num, double radius) {
        super(num);
        this.radius = radius;
    }

    @Override
    public double calcArea() {  // площадь круга
        double area = 2 * 3.14 * radius*radius;
        return area;
    }

    @Override
    public double calPerimeter() {
        double Perimetr = 2 * 3.14 * radius;
        return Perimetr;
    }
}
