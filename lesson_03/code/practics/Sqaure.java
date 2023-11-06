package practics;

public class Sqaure {
    public static void main(String[] args) {
        // S = n * n = n2, S - square of square, n - side
        int square = squareofSquare(30);
        printSquare(square);
    }
    public static int squareofSquare(int side) { // return object type int
        return side*side;
    }
    public static void printSquare(int square) {
        System.out.println("Hi square of square = " + square);
    }
}

