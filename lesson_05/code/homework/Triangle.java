package homework;


public class Triangle {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 5;

        if (a < b + c & b < a + c & c < a + b) {
            System.out.println(" Tiangle Yes");
        } else System.out.println(" Tiangle No");
    }
}