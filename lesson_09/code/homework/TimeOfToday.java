package homework;

import java.util.Scanner;

public class TimeOfToday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hello ! Whats your name ?  ");
        String name = scanner.next();
        System.out.println( "Mr / Ms " + name + "  please tell me What time now ? ( our from 0 to 23 )" );
        int time = scanner.nextInt();
        switch (time) {
            case 6, 7, 8, 9, 10, 11, 12->System.out.println(" Now  Morning.   Good  -  Morning " + name +"!");
            case 13, 14, 15, 16, 17->System.out.println(" Now Day.    Good  -  Day , " + name +"!");
            case 18, 19, 20, 21, 22, 23->System.out.println(" Now Ivening.  Good  -  Ivening , " + name +"!");
            case 0, 1, 2, 3, 4, 5->System.out.println(" Now Night.  Good  -  Night , " + name +"!");
        }
    }

}
