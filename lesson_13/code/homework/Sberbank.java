package homework;
//Задача 3. В сберкассу на трёхпроцентный вклад положили s рублей.
//        Какой станет сумма вклада через n лет. Использовать цикл for.
import java.util.Scanner;

public class Sberbank {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter summ ");
        int x = scanner.nextInt();
        System.out.println("Enter years");
        int y = scanner.nextInt();
        //int t = 1;
        double sum = x;
        for (int i = 1; i <=y ; i++) {
            sum = sum + (sum*3*y*12)/(y*12*100);
            System.out.println("year " +i+ " your deposit = " + Math.ceil(sum));

                    }
        System.out.println(Math.ceil(sum));
    }
}
