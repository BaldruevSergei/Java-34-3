package homework;

        import java.util.Scanner;

//Задание 3. Написать программу для "Кофе-машины", которая позволяет пользователю выбрать напиток:
//
//Эспрессо
//Американо
//Латте
//Капучино После выбора программа должна сообщить стоимость выбранного напитка.
public class Coffe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice your coffe  number 1 - Эспрессо    number 2 - Американо   number 3 -Латте     number 4- Капучино");
        int typeOfCoffe = scanner.nextInt();
        switch (typeOfCoffe){
            case 1-> System.out.println("Price = 2 $");
            case 2-> System.out.println("Price = 3 $");
            case 3-> System.out.println("Price = 1 $");
            case 4-> System.out.println("Price = 4 $");
            default -> System.out.println("Your number wrong");
        }
    }
}