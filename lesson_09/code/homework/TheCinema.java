package homework;
// Задача 3. В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне, что увеличит стоимость
// билета на 25%. Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места.
import java.util.Scanner;
public class TheCinema {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wat's your name ? ");
                String name = scanner.next();
                System.out.println(name + " How old are you ? ");
                double old = scanner.nextInt();
                System.out.println(name + "   You are a student?  Yes number- 1 / No number - 0 ");
                double stud = scanner.nextInt();
                System.out.println(name + " Do you want a place in VIP Zone ?   Yes number 1 / No number- 0 ");
                double vip = scanner.nextInt();
                double standart = 100;
                if ((old > 18) & (old < 60) & (stud == 0) & (vip == 0)) {
                    old = 1; stud = 1; vip = 1; }
                if ((old > 18) & (old < 60) & (stud == 1) & (vip == 0)) {
                    old = 1;  stud = 0.9; vip = 1; }
                if ((old > 18) & (old < 60) & (stud == 0) & (vip == 1)) {
                    old = 1;  stud = 1; vip = 1.25; }
                if ((old > 18) & (old < 60) & (stud == 1) & (vip == 1)) {
                    old = 1; stud = 0.9; vip = 1.25;}
                if ((old > 60) & (stud == 0) & (vip == 0)) {
                    old = 0.75; stud = 1; vip = 1; }
                if ((old > 60) & (stud == 0) & (vip == 1)) {
                    old = 0.75;  stud = 1; vip = 1.25;      }
                if ((old > 60) & (stud == 1) & (vip == 0)) {
                    old = 0.75;  stud = 0.9; vip = 1.25;      }
                double x = calculateTicketPrice(old, stud, vip, standart);
                System.out.println( name+  "   Yor price  ticket  =  " + x);
            }
            public static double calculateTicketPrice ( double a, double b, double c, double d){
                return d * a * b * c;
            }
        }


