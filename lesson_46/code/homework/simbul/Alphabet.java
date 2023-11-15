package homework.simbul;

import java.util.ArrayList;

public class Alphabet {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения символов
        ArrayList<Character> alphabetList = new ArrayList<>();

        // Заполняем ArrayList символами от A до Z
        for (char ch = 65; ch <= 90; ch++) {
            alphabetList.add(ch);
        }

        // Выводим содержимое ArrayList
        System.out.println("Символы латинского алфавита от A до Z: ");
        for (char ch : alphabetList) {
            System.out.print(ch + " ");
        }
    }
    }

