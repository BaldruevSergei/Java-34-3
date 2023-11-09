package practice.fibonacci;

import java.util.Iterator;

public class FibonacciAppl {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci(10);
        Iterator<Integer> iterator = fibonacci.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            int dd = iterator.next();
            System.out.print(dd + " ");// TODO - распечатать первые 8 числе из ряда Фибаначчи
            // 1, 1, 2 , 3, 5, 8, 13 , 21 - это должно получиться
            sum += dd;
            dd = sum;

        }
        System.out.println();
        System.out.println("=============================");
        System.out.println(" sum = " + sum); // TODO - сложить все эти числа
        // sum = 54








    }
}
