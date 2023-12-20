package practice;
import java.io.BufferedReader;import java.io.FileNotFoundException;
import java.io.FileReader;import java.io.IOException;
import java.time.LocalDate;import java.time.temporal.ChronoUnit;
public class EnployeeDataAppl {
    public static void main(String[] args) throws FileNotFoundException {
        // считать из файла employee.csv

        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
            String str = br.readLine(); // считали 1-ю строку
            //System.out.println(str);
            String[] cells = str.split(",");
            printCells(cells);
            // total salary
            // total employees
            // average salary
            // average age
            // читаем по строкам и что можем сразу считаем
            double salary = 0;
            int counter = 0;
            int age = 0;
            str = br.readLine();
            while (str != null) {
                counter++;
                cells = str.split(",");
                salary += Double.parseDouble(cells[2]);
                LocalDate birthDate = LocalDate.parse(cells[3]); // считали из стринг в LocalDate
                age += ChronoUnit.YEARS.between(birthDate, LocalDate.now()); // вытаскиваем год рождения
                printCells(cells);
                str = br.readLine();
            }
            System.out.println("Total salary :  " + salary);
            System.out.println("Total employees : " + counter);
            System.out.println("Average salary : " + salary / counter);
            System.out.println("Average age : " + (double) age / counter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printCells(String[] cells) {
        for (String s : cells) {
            System.out.print(s + "\t"); // "\t" - табуляция//
        }
        System.out.println();
    }
}
