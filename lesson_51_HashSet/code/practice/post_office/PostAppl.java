package practice.post_office;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PostAppl {
    public static void main(String[] args) {
        //**Задача:** Написать приложение, которое позволит понять,
        //        из каких мест на данную почту приходят письма.

        // Оператор будет вводить индексы из приходящих писем, будем их вносить в HushSet
        // в конце смены распечатать HashSet
        Set<String> postCode = new HashSet<>();
        do {
            System.out.println("Welcome to Post office.");
            Scanner scanner = new Scanner(System.in);
            // приглашение пользователю
            System.out.println("Input Post code ");
            String newPostCode = scanner.nextLine();
            if ( postCode.add(newPostCode)){ // ставим в условие если занесли
                System.out.println("Post code added");
            } else {
                System.out.println("Post code already exists"); // если уже есть он
            }
            System.out.println("Continue? Press S to stop.");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("s")) {
                break;

            }

        } while (true);

        System.out.println("Post code = ");
        System.out.println(postCode);



    }
}
