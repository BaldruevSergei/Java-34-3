package homework;
//Создайте массив из 20 целых чисел в интервале от 10 до 30. Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.
public class Change {
    public static void main(String[] args) {
        int[] arrayChange = new int[30];
        int a = 1;
        int b = 1;

        for (int i = 9; i < arrayChange.length; i++) {
            arrayChange[i] = i + 1;
            System.out.print(arrayChange[i] + " ");
        }

        a = arrayChange[1];
        b = arrayChange[29];
        arrayChange[1] = b;
        arrayChange[29] = a;
        System.out.println();
        for (int i = 9; i < arrayChange.length; i++) {
            System.out.print(arrayChange[i] + " ");
        }

    }
}




