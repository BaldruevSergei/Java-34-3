package homework.figure.shape;

public class Triangle extends  Shape{
    private double side;

    public Triangle(double num, double side) {
        super(num);
        this.side = side;


    }

    @Override
    public double calcArea() { // площадь треугольника
        double heigth = Math.sqrt(3)/2 * side;
        double area = 0.5 * side * heigth;
        return Math.round(area);
        }


    @Override
    public double calPerimeter() { // периметр треугольника
        double perimetr = side * 3;
        return perimetr;
    }
}
