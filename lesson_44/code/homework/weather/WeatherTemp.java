package homework.weather;

import java.util.Arrays;

//Задача 1. Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября.
// Данные представлены в виде двух массивов.
// Рассчитайте среднюю температуру в городе за прошедшие две недели.
public class WeatherTemp {
    public static void main(String[] args) {

        //int a = -6;
        //int b = 10;
        int[] oct = MakeTemp(1,10);
        int[] nov = MakeTemp(-10,6);

        double average = (TempAverage(oct) + TempAverage(nov))/2;

        System.out.println(" last week of October the temperatures are :  " + Arrays.toString(oct));
        System.out.println(" first week of November the temperatures are :  " + Arrays.toString(nov));
        System.out.println("Average temperature = " + average);



    }

    public static int[] MakeTemp(double a, double b) { // метод который задает температуры генератором случайных чисел
        int[] coin = new int[7];
        for (int i = 0; i < coin.length; i++) {
            coin[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return coin;
    }
    public static double TempAverage(int[] arr){ // метод который принимает массив с температурами
        double temp =0 ;                                        // и считает среднюю
        for (int i = 0; i < arr.length; i++) {
            temp += (double) arr[i] / arr.length;
        } return temp;
    }



}
