package homework.currencyexchange;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CurrencyExchangeAppl {
    public static void main(String[] args) {
        // Задача 3. Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь, что в списке нет дублей
        // кодов валют. Выведите список валют и их курсов на экран. Реализуйте возможность для пользователя выбрать
        // желаемую валюту, ввести ее количество и узнать,
        // сколько он получит при обмене на евро.

        CurrencyExchange[] currency = CurrencyExchange.values();
        for (CurrencyExchange c : currency) {
            System.out.println(c);
        }
        Set<Integer> numVal = new HashSet<>();
        for (int i = 0; i < currency.length; i++) {
            if (numVal.add(currency[i].getNumber())) {
                System.out.println(currency[i].getName() + " added.");
            } else {
                System.out.println(currency[i].getNumber() + " already exists.");
            }
        }
        for (CurrencyExchange c : currency) {
            System.out.println(c);
        }
        System.out.println("Choice currency ");
        try {
            Scanner scanner = new Scanner(System.in);

            int d = scanner.nextInt();
            System.out.println("Choice quantity ");
            double b = scanner.nextDouble();
            double sum = 0;
            for (CurrencyExchange c : currency) {
                if (d == 1 && c.getNumber() == 1) { // проверка что это именно та валюта
                    sum = b * c.getCourse();
                } else if (d == 2 && c.getNumber() == 2) { // проверка что это именно та валюта
                    sum = b * c.getCourse();
                } else if (d == 3 && c.getNumber() == 3) { // проверка что это именно та валюта
                    sum = b * c.getCourse();
                } else if (d == 4 && c.getNumber() == 4) { // проверка что это именно та валюта
                    sum = b * c.getCourse();
                }
            }

            System.out.printf("You got: %.2f", sum);
            System.out.println(" euro.");
        } catch ( Exception d){
            System.out.println("Your choice is wronge");}

    }
}









