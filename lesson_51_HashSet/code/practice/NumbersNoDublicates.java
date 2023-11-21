package practice;
//- Имеется список из 100 случайных чисел в интервале от 1 до 10, необходимо удалить из него
//  все дубликаты.
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class NumbersNoDublicates {
    public static void main(String[] args) {



        int[] numbers = new int[100];
        int a = 1;
        int b = 10;

        Random random= new Random();// вызываем рандом

        // заполнили массив
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(b) + a;
        }
        // распечатали  массив
        for (Integer o : numbers) {
            System.out.print(o + " | ");

        }
        // занесли массив в set, способ 1
        Set<Integer> unigueNumbers = new HashSet<>();
        System.out.println("------------------------------");
        System.out.println("Size of set " + unigueNumbers.size());
        System.out.println("Is empty " + unigueNumbers.isEmpty());
        for (int i = 0; i < numbers.length; i++) {
            unigueNumbers.add(numbers[i]);
        }
        // занесли массив в set, способ 2
        for (Integer n : numbers) {
            unigueNumbers.add(n);
        }


        System.out.println(unigueNumbers);
        System.out.println("====================================");
        // распечатали массив в set, способ 1
        for (Integer n: unigueNumbers) {
            System.out.print(n + "  |  ");
        }
        System.out.println();
        // распечатали массив в set, способ 1
        System.out.println(unigueNumbers);


    }
}
