package practics;
//Задание 3. Написать метод, возвращающий максимальное из двух целых чисел, использовать тернарный оператор. Добавить метод,
 //      который возвращает максимальное из трех целых чисел. Числа задаются в программе.
public class Maximim {
    public static void main(String[] args) {
        int a = -20;
        int b = 50;
        int c = 60;
        int max3 = maximum3(a, b, c);
        System.out.println(" Максимум " + max3);

    }

    public static int maximum(int a, int b){
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
    public static int maximum3(int a, int b, int c) {
        int max3 = 0;
        if (a > b && a > c) {
            max3 = a;
        }
        if (b > a & b > c) {
            max3 = b;
        } else {
            max3 = c;
        }

        return max3;
    }
}

