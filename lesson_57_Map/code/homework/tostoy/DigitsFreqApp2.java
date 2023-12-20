package homework.tostoy;

import java.util.*;

public class DigitsFreqApp2 {

    public static void main(String[] args) {
        // Fill it with 1 million random digits
        int min = 0;
        int max = Integer.MAX_VALUE;
        Random random = new Random();
        int[] arr = new int[1_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min) + min;
        }
        // сделали Мапу и внесли туда  наш массив из 1 млн случайных чисел
        HashMap<Integer, Integer> digitFrequencyMap = new HashMap<>();
        for (int i : arr) {
            //метод вызывается в цикле и подсчитывает частоту встречаемости каждой цифры для всех чисел в массиве arr.
            countDigits(i, digitFrequencyMap);
        }

        // Вывод результатов (ключи это цифры от 0 до 9)
        for (int key = 0; key <= 9; key++) {

            int occurrences = digitFrequencyMap.getOrDefault(key, 0);
            System.out.println("Ключ: " + key + ", Частота: " + occurrences);
        }
    }
    //метод подсчитывает частоту встречаемости каждой цифры для всех чисел
    private static void countDigits(int number, Map<Integer, Integer> digitFrequency) {
        while (number > 0) {
            int currentDigit = number % 10;
            digitFrequency.put(currentDigit, digitFrequency.getOrDefault(currentDigit, 0) + 1);
            number /= 10;
        }
    }
}




