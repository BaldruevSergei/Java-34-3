package homework.figure.shape;

public class Square extends Shape{
    private double side;

    public Square(double num, double side) {
        super(num);
        this.side = side;
    }

    @Override
    public double calcArea() {
        double area = side * side;
        return area;
    }

    @Override
    public double calPerimeter() {
        double perimetr = side * 4;
        return perimetr;
    }
}
