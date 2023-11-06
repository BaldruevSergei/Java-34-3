package homework;

        import java.util.Scanner;

        import static java.lang.Thread.sleep;

public class Bot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What's your name ?");
        String name = scanner.next();
        System.out.println("Hi " + name + "!");
        System.out.println(name + "Can you say about your age?  Yes/No  ");
        String age = scanner.next();
        if (age.equals("Yes")) {
            System.out.println(name + "Tell me your wheght, please! ");
            int wheght = scanner.nextInt();
            if ((wheght  ==  50) | (wheght < 50)) {
                System.out.println(name + "   Your can meet more offen please");
            }
            if ((wheght > 50) & (wheght < 80)) {
                System.out.println(name + "   Your are in exellent form ");
            }
            if (wheght > 80) {
                System.out.println(name + "   You have to lose weigth");
            }

        }
        else System.out.println("Sorry by!");


    }



}