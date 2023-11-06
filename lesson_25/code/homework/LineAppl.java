package homework;
//сообщает сколько слов в строке
//сообщает сколько букв (символов) в строке
//печатает строку задом наперед, начиная с последнего слова.
import java.util.Arrays;
import java.util.Scanner;

public class LineAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input line");
        String str = scanner.nextLine();
        String[] words = str.split(" "); //  разделяем строку на элементы массива типа String
        System.out.println( " Quantity of words in string " + words.length); // длина массива сообщает сколько слов в строке
        System.out.println("-------------------------------------------------");
        String str1 = str;
        str1 = str1.replaceAll("\\s", "");
        String[] words1 = str1.split(""); // разделеитель отсуствует, чтобы получить буквы

        System.out.println( " Quantity of letters  in string " + words1.length); // длина массива сообщает сколько букв (символов) в строке без пробелов
        System.out.println(Arrays.toString(words1));
        System.out.println("---------------------------------------------------");
        System.out.println(reverseString(str));  //печатает строку задом наперед, начиная с последнего слова.

    }
        public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
        }



    }

