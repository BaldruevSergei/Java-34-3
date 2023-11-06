package practice.coffee;

import java.util.Scanner;

public class CaffeeAppl {
    public static void main(String[] args) {
        System.out.println("Welcom to CoffeeShop!");
        // предложить меню для выбора
        Coffee[] menu = Coffee.values();
        for (int i = 0; i < menu.length; i++) {

            while (true) {
                System.out.println((i + 1) + " - " + menu[i].getType());

                System.out.println("Input your choice");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Your choice is: " + menu[choice - 1].getType());
                        System.out.println("The price is: " + menu[choice - 1].getPrice());
                        break;
                    }
                    // раскопировать кейс
                    default -> {
                        System.out.println("Wrong choice");
                    }
                }

            }
        }
    }
}
