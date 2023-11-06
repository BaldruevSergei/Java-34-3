package homework.arrayMethods;
//Задача 1. Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
//
//сумма всех элементов массива;
//поиск элемента в массиве;
public class ArrayMethods {
    public int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        } return sum;
    }

    public static int arraySerch(int a, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a);{
            return i;
            }


    }return -1;


    }
}
