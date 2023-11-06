package homework.figure.shape;

public abstract class Shape {
    protected final double num;

    public double getSide() {
        return num;
    }

    protected Shape(double num) {
        this.num = num;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return Double.compare(shape.num, num) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(num);
        return (int) (temp ^ (temp >>> 32));
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("Shape");
        sb.append("Area").append(calcArea());
        sb.append("Perimeter").append(calPerimeter());
        return sb.toString();
    }
    public  abstract double calcArea();
    public abstract double calPerimeter();


    }



