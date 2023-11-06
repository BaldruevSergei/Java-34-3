package homework;
//Задача 2. Бросьте кубик с 6-ю гранями 20 раз. Подсчитайте, сколько раз выпала каждая цифра.
public class PlayingCub {
    public static void main(String[] args) {

        // запустим цикл на 20 раз, от датчика случайных чисел получим от 1 до 6
        // запишем результаты  в массив cube
        // подсчитаем количество чисел от 1 до 6 в отдельный numbers который обнулили сначала

        int[] cube = new int[20];
        int[] number = {0, 0, 0, 0, 0, 0};
        int a = 1;
        int b = 6;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int number6 = 0;

        for (int i = 0; i < cube.length; i++) {
            cube[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        printArray(cube);


        for (int i = 0; i < cube.length; i++) {
            if (cube[i] == 1) {
                number1 = number1 + 1;
            }
            if (cube[i] == 2) {
                number2 = number2 + 1;
            }
            if (cube[i] == 3) {
                number3 = number3 + 1;
            }
            if (cube[i] == 4) {
                number4 = number4 + 1;
            }
            if (cube[i] == 5) {
                number5 = number5 + 1;
            }
            if (cube[i] == 6) {
                number6 = number6 + 1;
            }
        }
        System.out.println("Число  1 выпало " + number1 +" раз ");
        System.out.println("Число  2 выпало " + number2 +" раз ");
        System.out.println("Число  3 выпало " + number3 +" раз ");
        System.out.println("Число  4 выпало " + number4 +" раз ");
        System.out.println("Число  5 выпало " + number5 +" раз " );
        System.out.println("Число  6 выпало " + number6 +" раз ");
    }

        public static void printArray(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }


        }



