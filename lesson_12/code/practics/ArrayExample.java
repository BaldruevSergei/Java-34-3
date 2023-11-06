package practics;
// Задача 1. Задан массив целых чисел: 75, 34, -15, -123, 57,
// -145, 86, 77, 48, -59. Найдите минимальный элемент массива
// и его индекс. Напечатайте все элементы массива с НЕчетными индексами.
// Найдите произведение всех четных элементов массива.
public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {75, -250, -15, -123, -250, -145, 86, 77, 48, -251};
        System.out.println("Min element of array is : " +minElOfArray(array));

        int i = minElOfArrayIndex(array);
        System.out.println("Index of Min element of array is " + i);


    } // ======= end of main =====
    // ====================== Methods ==============

    public static int minElOfArrayIndex(int [] arr){
        // прробегаем по всему массиву, каждый элекмент сравним с неким min
        // если элемент будет меньше min, то делаем min = 'этому элементу'
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] <= min ){ // если элемент массива с индексом i меньше min
                min = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }
    public static int minElOfArray(int [] arr){
        // прробегаем по всему массиву, каждый элекмент сравним с неким min
        // если элемент будет меньше min, то делаем min = 'этому элементу'
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < min ){ // если элемент массива с индексом i меньше min
                min = arr[i];
            }
        }
        return min;
    }


    // ====================== snd of  Methods =======

}
