package practices;
// Задача 1. Создайте массив и заполните его символами латинского алфавита
// от A до Z. Раcпечатайте полученный массив.
public class ArrayAlphabet {
    public static void main(String[] args) {

        int[] arrayNun = new int[20]; // объявили массив

        for (int i = 0; i < arrayNun.length; i++) { // запускаем цикл
            arrayNun[i] = i + 1;
        } // заполняем элементы массива

        for (int i = 0; i < arrayNun.length; i++) { // печатаем данный массив
            System.out.print(arrayNun[i] + ", ");
        }


        System.out.println();
        System.out.println(arrayNun[0]);
        System.out.println(arrayNun[19]);


        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (65 + i); // 65 это код большой буквы А латинского алфавита
        }
        // печать массива
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print (alphabet[i]+ " ");
        }


           // System.out.print (arrayNun[20]);



        }
        }




