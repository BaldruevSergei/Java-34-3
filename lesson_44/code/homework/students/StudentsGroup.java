package homework.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Задача 2. Распределить группу студентов на две примерно равных группы (+/- 1 человек) случайным образом.
// Определить массив студентов в программе. Получить на выходе 2 списка студентов (2 массива).
public class StudentsGroup {
    public static void main(String[] args) {
        // задаем массив из фамилий студентов
        String[] stud = {"Socolov", "Smith", "Wood", "Lee", "Ford", "Chan", "Richi", "Show", "Korsar", "White", "Obama", "Darvin"};
        List<String> namestud = new ArrayList<>(Arrays.asList(stud)); //конвертируем массив в ArrayList

        int size = Math.round(stud.length / 2); // определяем длину массива list1
        String[] list1 = new String[size];// объявляем первый массив list1
        List<String> dd = new ArrayList<>(Arrays.asList(list1));
        String[] list2 = new String[size]; // объявляем второй массив list2
        List<String> ss = new ArrayList<>(Arrays.asList(list2));


        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
               while ((dd.contains(list1[i]) != dd.contains(list1) == true))     {
                    list1[i] = stud[rnd.nextInt(stud.length)]; }
        }





        System.out.println(Arrays.toString(stud));
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));



    }

    public static String[] randomStringFromArr(String[] arr) {
        Random rnd = new Random();
        int size = arr.length / 2;
        String[] coin = new String[size];
        for (int i = 0; i < size; i++) {
            if (coin[i] != arr[i]) {
                coin[i] = arr[rnd.nextInt(arr.length)];
                 } else coin[i] = arr[rnd.nextInt(arr.length)];
            }return coin;


            }


        }


/*
    public static String[] randomStringFromArr(String[] arr) {
        Random rnd = new Random();
        int s = 0;
        String[] coin = new String[arr.length / 2];
        while (s < 1) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (coin[j] != arr[i]) {
                        coin[j] = arr[rnd.nextInt(arr.length)];
                        if (arr[i]== coin[j]) {
                            s++;
                        }

                    }
                }


            }


        }
        return coin;*/


