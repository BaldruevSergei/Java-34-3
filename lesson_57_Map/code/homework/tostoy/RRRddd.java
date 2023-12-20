package homework.tostoy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RRRddd {
    public static void main(String[] args) {


        // Fill it with 1 million random digits
        int min = 0;
        int max = 1_000_000;
        Random random = new Random();

        int[] arr = new int[1_000_000];
        arr = Arrays.stream(arr)
                .map(item -> random.nextInt(min, max))
                .toArray();
                // ключами будут цифры от 0 до 9
                // Подсчитываем частоту встречаемости цифр
                Map<Integer, Integer> digitFrequency = countDigitFrequency(arr);

                // Выводим результаты
                System.out.println("Частота встречаемости цифр:");
                for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }

            private static Map<Integer, Integer> countDigitFrequency(int[] numbers) {
            // Создаем карту для хранения частоты встречаемости цифр
            Map<Integer, Integer> digitFrequency = new HashMap<>();

            // Проходим по каждому числу в массиве
             for (int number : numbers) {
            // Вызываем вспомогательный метод для подсчета частоты цифр в числе
            countDigits(number, digitFrequency);
            }

            // Возвращаем карту с частотой встречаемости цифр
            return digitFrequency;
            }



            // Метод для подсчета частоты встречаемости  цифр
            private static void countDigits(int number, Map<Integer, Integer> digitFrequency) {
                // Пока число не станет равным нулю, извлекаем его цифры
                while (number > 0) {
                    // Извлекаем последнюю цифру числа
                    int currentDigit = number % 10;

                    // Обновляем частоту встречаемости данной цифры
                    digitFrequency.put(currentDigit, digitFrequency.getOrDefault(currentDigit, 0) + 1);

                    // Убираем последнюю цифру из числа
                    number /= 10;
                }
            }
            }




