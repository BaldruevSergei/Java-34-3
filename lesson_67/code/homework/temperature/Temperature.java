package homework.temperature;

import java.time.LocalDate;
import java.util.*;

//Задача 2. В массиве с ночной температурой за прошедшие 2 недели выяснить сколько раз ночью была
// минусовая температура. В какой из дней наблюдений случился первый заморозок? Когда был такой
// последний день? Какая максимальная температура была за период наблюдений? В какой день это было?
// Какая минимальная температура была за период наблюдений? В какой день это было? Какая средняя ночная
// температура была за период наблюдений?
// Были ли периоды, когда минус ночью держался несколько дней подряд?
public class Temperature {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        ArrayList<Integer> temperatures = new ArrayList<>();
        // создаем массив температур из случайных чисел
        Random random = new Random();
        int arrayListSize = 14;
        // Fill the ArrayList with random integers in the range from -10 to 10
        for (int i = 0; i < arrayListSize; i++) {
            int randomNumber = random.nextInt(21) - 3; // Generates a random integer in the range [-10, 10]
            temperatures.add(randomNumber);
        }

        for (Integer d : temperatures) {
            System.out.print(d + " / ");
        }

        // переводим в стрим выяснить сколько раз ночью была  минусовая температура.
        long countnegativeTemperature = temperatures.stream()
                .filter(integer -> integer < 0)
                .count();
        System.out.print("\n day < 0 = " + countnegativeTemperature);

        //  В какой из дней наблюдений случился первый заморозок?
        long negativeFirstTemperature = temperatures.stream()
                .filter(integer -> integer < 0).findFirst()
                .orElse(0);
        System.out.println("\n First day of <0  = " + negativeFirstTemperature);

        // Когда был такой последний день?
        Optional<Integer> negativeLastTemperature = temperatures.stream()
                .filter(integer -> integer < 0)
                .reduce((first, second) -> second);
        System.out.println("\n Last day of <0  = " + negativeLastTemperature);

        // Какая максимальная температура была за период наблюдений? В какой день?
        Optional<Integer> maxTemperature = temperatures.stream()
                .max(Integer::compareTo);
        int indexOfMaxTemperature = temperatures.indexOf(maxTemperature.get());
        System.out.println("Max temperature: " + maxTemperature.get() + " on day " + (indexOfMaxTemperature + 1));


        // Какая минимальная температура была за период наблюдений? В какой  день?
        Optional<Integer> minTemperature = temperatures.stream()
                .min(Integer::compareTo);
        int indexOfMinTemperature = temperatures.indexOf(minTemperature.get());
        System.out.println("Min temperature: " + minTemperature.get() + " on day " + (indexOfMinTemperature + 1));

        // Какая средняя ночная температура была за период наблюдений?
        IntSummaryStatistics averageTemp = temperatures.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Average temperature = " + averageTemp.getAverage());

        // Были ли периоды, когда минус ночью держался несколько дней подряд?

        boolean anyMinus = false;
        boolean prevNegative = false;

        for (int температура : temperatures) {
            if (температура < 0) {
                if (prevNegative) {
                    anyMinus = true;
                    break;
                }
                prevNegative = true;
            } else {
                prevNegative = false;
            }
        }

        // Вывести результат
        System.out.println("Были ли периоды, когда минус ночью встречался более одного раза подряд: " + anyMinus);
    }








}

