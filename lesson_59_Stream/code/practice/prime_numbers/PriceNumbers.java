package practice.prime_numbers;

import java.util.ArrayList;
import java.util.List;

public class PriceNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(
                10,11,12,13,14,15,16,17,18,19,20
        ));
        // отобрать только простые числа
        System.out.println("Numbers");
        numbers.stream()
                .forEach(n-> System.out.print(n + " "));
        System.out.println();

        System.out.println("Prime numbers  ");
        numbers.stream()
                .filter(n -> isPrime(n)) // фильтр
                .forEach(n-> System.out.print(n + " " ));
        System.out.println();

        // другой способ
        System.out.println("Prime numbers - 2 ");
        numbers.stream()
                .map(n-> isPrime1(n))
                .forEach(n-> System.out.print(n + " " ));


    }
    public static boolean isPrime(int n) {
        int i = 2;
        while (i < n ) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static int isPrime1(int n) {
        int i = 2;
        while (i < n) {
            if (n % i == 0) {

            }
            i++;
        }
        return i;
    }


}

