package homework.chip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ChipAppl {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("train.csv"))) {
            String str = br.readLine(); // считали 1-ю строку
            String[] cells = str.split(",");
            printCells(cells);
            //System.out.println(str);
            //Задание 2. Посчитайте средний тариф для 1,2,3 классов путешествия.
            //Задание 3. Подсчитайте общее количество выживших и погибших пассажиров.
            //Задание 4. Подсчитайте общее количество выживших и погибших мужчин, женщин и детей (до 18 лет).
            //Задание 1. Подсчитайте общую стоимость проезда.
            double price = 0;
            int countter1 = 0; // кол-во 1 класса
            double price1 = 0; // цена для 1 класса
            int countter2 = 0; // кол-во 2 класса
            double price2 = 0;
            int countter3 = 0; // кол-во 3 класса
            double price3 = 0;
            int humanYes= 0;
            int humanNo= 0;
            int humanYesMan = 0;
            int humanYesWoman = 0;
            int humanNoWoman = 0;
            int humanNoMan = 0;
            int childYes = 0;
            int childNo = 0;
            str = br.readLine();
            while (str != null) {
                /*if (cells[6].trim().isEmpty()) {
                    cells[6] = "0";}*/
                cells = str.split(",");
                cells[6] = cells[6].replaceAll("\\s", "0"); // Заменяем пробелы на "0" в  подстроке
                price += Double.parseDouble(cells[10]);
                if (1 == Integer.parseInt(cells[2])) {
                    price1 += Double.parseDouble(cells[10]);
                    countter1++;
                } else if (Integer.parseInt(cells[2]) ==2) {
                    price2 += Double.parseDouble(cells[10]);
                    countter2++;
                } else if (Integer.parseInt(cells[2]) == 3) {
                    price3 += Double.parseDouble(cells[10]);
                    countter3++;
                }
                if (Integer.parseInt(cells[1]) == 1) {
                  humanYes++;
                    // мужчины, выжившие (старше 18 лет и возраст у кого пробел (отсутсвует)). если был куплен билет значит он взрослый был
                   if  ((cells[5].equalsIgnoreCase("male")) && ((cells[6].equalsIgnoreCase(""))||(Double.parseDouble(cells[6]) >=18))) {
                        humanYesMan++;
                    }
                    // женщины,  выжившие (старше 18 лет и возраст у кого пробел (отсутсвует)). если был куплен билет значит он взрослый был
                    if ((cells[5].equalsIgnoreCase("female"))&& ((cells[6].equalsIgnoreCase(""))||(Double.parseDouble(cells[6]) >=18))) {
                         humanYesWoman++;
                    }
                    // дети выжившие
                    if  (!(cells[6].equalsIgnoreCase("")) && ((Double.parseDouble(cells[6]) < 18))) {
                        childYes++;
                    }
              } else {
                  humanNo++;
                    // мужчины невыжившие (старше 18 лет и возраст у кого пробел (отсутсвует)). если был куплен билет значит он взрослый был
                  if ((cells[5].equalsIgnoreCase("male")) && ((cells[6].equalsIgnoreCase(""))||(Double.parseDouble(cells[6]) >=18))) {
                      humanNoMan++;}
                    // женщины  невыжившие (старше 18 лет и возраст у кого пробел (отсутсвует)). если был куплен билет значит он взрослый был
                    if ((cells[5].equalsIgnoreCase("Female")) && ((cells[6].equalsIgnoreCase(""))||(Double.parseDouble(cells[6]) >=18))) {
                        humanNoWoman++;}
                    // дети выжившие
                    if  (!(cells[6].equalsIgnoreCase("")) && ((Double.parseDouble(cells[6]) < 18))) {
                        childNo++;
                    }
              }
                printCells(cells);
                str = br.readLine();
            }
            System.out.println();
            System.out.println("Total price Pclass 1 : " + price1 / countter1);
            System.out.println("Total price Pclass 2 : " + price2 / countter2);
            System.out.println("Total price Pclass 3 : " + price3 / countter3);
            System.out.println("Total price  : " + price);
            System.out.println("Total Survived human : " +humanYes);
            System.out.println("Total Unsurvived human : " +humanNo);
            System.out.println("Total Survived human Man : " +humanYesMan);
            System.out.println("Total Unsurvived human Man : " +humanNoMan);
            System.out.println("Total Survived human Woman : " +humanYesWoman);
            System.out.println("Total Unsurvived human Woman : " +humanNoWoman);
            System.out.println("Total Survived child : " + childYes);
            System.out.println("Total Unsurvived child : " + childNo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void printCells(String[] cells) {
        for (String s : cells) {
            System.out.print(s + "\t"); // "\t" - табуляция
        }
        System.out.println();
    }
}