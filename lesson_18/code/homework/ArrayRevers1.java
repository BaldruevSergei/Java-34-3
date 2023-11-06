package homework;
//Задача 1. Напишите метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
// Сначала последний элемент, потом предпоследний, и т.д.
//
//Измените (лучше скопируйте и сделайте еще один метод) метод так, чтобы он работал с массивом,
// заполненном "цифрами прописью": zero, one, two, three, ..., nine Выполните "разворот" это массива.
public class ArrayRevers1 {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        ArrayRevers(array);

    }

    public static void ArrayRevers(String[] arr) {
        String temp = " ";
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i]; // кладем левый элемент во временную переменную
            arr[i] = arr[arr.length - 1 - i]; // переносим правый элемент на  левый
            arr[arr.length - 1 - i] = temp; // место правого ставим тот, что в переменной
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}


