package homework.simbul;

import java.util.ArrayList;
import java.util.Scanner;

public class ResultAppl {
    public static void main(String[] args) {
        ArrayList<SportMens> sportMens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Введите результаты для спортсмена " + i + ":");
            System.out.print("Фамилия: ");
            String lastName = scanner.next();
            System.out.print("Имя: ");
            String firstName = scanner.next();
            System.out.print("Регистрационный номер: ");
            int registrationNumber = scanner.nextInt();
            System.out.print("Клуб: ");
            String club = scanner.next();
            System.out.print("Результат (в секундах): ");
            double resultInSeconds = scanner.nextDouble();
            SportMens sportMens1 = new SportMens(lastName, firstName,registrationNumber,club,resultInSeconds);
            sportMens.add(sportMens1);
        }
       // Arrays.compare();
    }
}
