package practice.company_v_new;

import practice.company_v_new.model.Employee;
import practice.company_v_new.model.Manager;
import practice.company_v_new.model.SalesManager;
import practice.company_v_new.model.Worker;

public class EmployeeAppl {
    public static void main(String[] args) {

        Employee[] empl = new Employee[4];
        empl[0] = new Manager(100, "John", "Smith", 45, 160, 5000, 5);
        empl[1] = new SalesManager(101, "Anna", "Black", 36, 160, 25000, 0.1);
        empl[2] = new SalesManager(102, "Thomas", "White", 28, 160, 30000, 0.1);
        empl[3] = new Worker(103, "Gans", "Bauer", 30, 160, 5);

        double total = totalSalary(empl); // вызываем метод для расчета зарплаты
        System.out.println("TOTAL SALARY: " + total);
        double average = averageAge(empl);
        System.out.println("Avarage Age: " + average);
        double totalSales = totalSales(empl);
        System.out.println(totalSales);
        int print = printAllEmployee(empl);
    }

    private static double totalSalary(Employee[] empl) {
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                sum += empl[i].calcSalary();
            }
        }
        return sum;
    }

    private static double averageAge(Employee[] empl) {
        double average = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                average += empl[i].getAge();
            }
        }
        return average / empl.length;
    }

    private static double totalSales(Employee[] empl) {
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] instanceof SalesManager) {
                SalesManager salesManager = (SalesManager) empl[i];
                sum += salesManager.getSalesValue();
            }
        } return sum;
    }

    private  static int printAllEmployee(Employee[] empl) {
        for (int i = 0; i < empl.length; i++) {
            System.out.println(empl[i]);

        }
        return 0;
    }

}