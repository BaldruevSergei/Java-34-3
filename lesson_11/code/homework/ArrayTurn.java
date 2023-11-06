package homework;
// Задача 3.()* Написать метод, принимающий массив целых чисел, и разворачивающий его. Последний элемент
// становится нулевым, предпоследний, первым, и т. д. Подсказка: этот метод должен изменить полученный массив.
public class ArrayTurn {
    public static void main(String[] args) {
        int[] ramdomInt = new int[10];
        int[] newarray = new int[10];
        int a = -10;
        int b = 10;

        for (int i = 0; i < ramdomInt.length; i++) {
            ramdomInt[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(ramdomInt[i] + "  ");
        }
        System.out.println();

        for (int i = 9; i < ramdomInt.length; i--) {
            newarray[0 + i] = ramdomInt[i];
            ramdomInt[i] = newarray[i];

                System.out.print(ramdomInt[i] + "  ");
        }

    }
}



