package practice;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class StreamRrimitivesAppl {
    private static final int N_NUMBERS = 10;
    private static final int MIN =1;
    private static final int MAX =10;

    public static void main(String[] args) {
        // получит случайные целые числа в виде потока
        Stream<Integer> numbers = getRandomNumbers(N_NUMBERS, MIN, MAX); // колво чисел - от до
       // numbers.forEach(System.out::println); // печать

        System.out.println("==================== Sum of numbers ===============");
        int sum = getRandomNumbers(N_NUMBERS, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(System.out::println)
                //.mapToInt(n -> n.intValue()) // стало числом
                .sum();
       // numbers.forEach(System.out::println); // печать
        System.out.println("Sum " + sum);
        System.out.println("====================== Summary Statistic================== ");

        IntSummaryStatistics intStat = getRandomNumbers(N_NUMBERS, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(System.out::println)
                .summaryStatistics();
        System.out.println(" min " + intStat.getMin() + " max " + intStat.getMax() + " Sum " + intStat.getSum() + " Average " + intStat.getAverage());

        System.out.println("=================== Lotto 6 from 49 ================== ");
        new Random()
                .ints(1,50) // левый край входит правый нет
                .distinct() // сначало убираем дубликаты
                .limit(6) // потом ограничиваем работу до 6
                .forEach(System.out::println);

        System.out.println("================= Shuffle===========================  ");
        int[] arr = {10, 20, 30, 40, 50};
        // нужно перетосавать в случайном порядке

        new Random()
                .ints(0, arr.length) // в этом диапазоне генерим случайные числа (индексы)
                .distinct()
                .limit(arr.length)
                .forEach(i -> System.out.println(arr[i]));

    }

    private static Stream<Integer> getRandomNumbers(int nNumbers, int min, int max) {
    return new Random()
            .ints(min,max)// открыли Stream
            .limit(nNumbers)
            .boxed(); // автоупаковка из int  в Integer
            //.mapToObj(n->(Integer)n);// так min max -это примитивы мы загоняем объекты

    }
}
