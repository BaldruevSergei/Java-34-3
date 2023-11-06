package homework;

import java.util.Scanner;

public class SportMen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number (How long have you been running today  ?) ");
        int distance = scanner.nextInt();
        System.out.println(" You ran today  " + distance + "  km");
        System.out.println("Enter your goal (km)");
        double target = scanner.nextInt();

        double distanceToday = target;
        double distanceYesturday = distance;
        int count = 0;
        while (distanceToday <= target) {
                    distanceToday = distanceYesturday   + (distanceYesturday * 0.1);
                    distanceYesturday = distanceToday;
                    count++;
                    Math.floor(distanceToday);
                    System.out.println("Your plan- Days " + count +      "    distance   " + Math.ceil(distanceToday));
            };
            System.out.println("  You will need " + count + "  days to achieve  the goal " + target);
    }
}
