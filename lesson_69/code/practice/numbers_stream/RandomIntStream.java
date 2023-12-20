package practice.numbers_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;


public class RandomIntStream {

    private static final int N_NUMBER = 6;
    private static final int MIN = -10;
    private static final int MAX = 10;


    public static void main(String[] args) {
        // - создать с помощью stream поток случайных целых чисел;
        // - выведите на печать элементы потока;
        // - сколько в потоке получилось положительных чисел? сколько отрицательных?
        // - просуммируйте все нечетные элементы потока;
        // - найдите максимальное число, минимальное число;
        // - выведите значения метода summaryStatistic.



        // свойства,

        Stream<Integer> numbers = getRandomNumber(N_NUMBER, MIN, MAX);
        numbers.forEach(System.out::println); // potok otrabotal i zakryt
        // pechataem krasivo
        Stream<Integer> numbers1 = getRandomNumber(N_NUMBER, MIN, MAX);
        numbers1.forEach(s -> System.out.print("Random number: " + s + " | "));
        System.out.println();

        long positiveCount = getRandomNumber(N_NUMBER, MIN,MAX)
                .peek(n->System.out.print(n+ "| "))
                .filter(n->n>0)
                .count();
        System.out.println(" \n Pozitive " + positiveCount);

        int sumOddNumbers = getRandomNumber(N_NUMBER, MIN, MAX)
                .peek(n-> System.out.print(n + " | "))
                .filter(n-> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("\n Sum of odd " + sumOddNumbers);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };

        int max = getRandomNumber(N_NUMBER, MIN, MAX)
                .peek(n->System.out.print(n + "| "))
                .max(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println("\n Max value = " + max);


        IntSummaryStatistics intStat = getRandomNumber(N_NUMBER, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(n->System.out.print(n + "| "))
                .summaryStatistics();
        System.out.println("\n min =" + intStat.getMin());
        System.out.println("man =" + intStat.getMax());
        System.out.println("sum =" + intStat.getSum());
        System.out.println("average =" + intStat.getAverage());
        System.out.println(intStat);

    }

    private static Stream<Integer> getRandomNumber(int nNumber, int min, int max) {
        return new Random()
                .ints(min, max)
                .limit(nNumber)
                .boxed(); // upakovka v chisla

    } // end of main
} // end of class