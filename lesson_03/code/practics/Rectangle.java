package practics;

public class Rectangle {public static void main(String[] args) {
    // S = x * y, where S- sqaure of rectangle, x - length,  y - width
    int square = squareofRectagle(30,40);
    printSquareofrectangle(square);
}
    public static int squareofRectagle(int length, int width) {// return object type int
        return  length*width;
    }
    public static void printSquareofrectangle(int square) {
        System.out.println("square of rectangle = "+square);
    }
}

