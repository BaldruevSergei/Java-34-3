package practice.stream_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAppl {
    public static void main(String[] args) {
        List<Integer>  numbers = new ArrayList<>(List.of(1,9,2,8,3,7,4,6,5));

        numbers.stream() // открыли stream
                .filter(n -> n > 3)//  Отбираем числа > 3
                .peek(n -> System.out.println("peek befor sort : " + n)) // для отладки
                .sorted((n1,n2) -> -Integer.compare(n1,n2)) // сортируем
                .forEach(System.out:: println); // печать

        System.out.println("==============================");
        numbers.forEach(System.out::println); // еще один вариант печати
        System.out.println("==============================");


        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        Stream<Integer>  streamInt = Arrays.stream(arr)
                .filter(n-> n > 2) // выдираем больше 2
                .filter( n -> n%2==0) // выбираем четные
                .sorted((n1,n2) -> - Integer.compare(n1,n2)); // сортировка
        streamInt.forEach(System.out::println); // печать

        System.out.println("==============================");
        Integer res = Arrays.stream(arr)
                .map(n -> n * 10) // каждое число переводим в число уведиченное в 10 раз (преобразование)
                .reduce(0, (accum, n) ->  accum + n); // накопление
        System.out.println("sum = " + res);

        // перевели массив в String
        String str = Arrays.stream(arr)
                .sorted((n1,n2) -> -Integer.compare(n1,n2)) // сортиовка
                .map(Object::toString) // преоброзование в стринг
                .reduce("Result = ", (accum, n) ->  accum + n);
        System.out.println(str);
        System.out.println("==============================");

    }
}
