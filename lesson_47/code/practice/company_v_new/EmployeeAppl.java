package practice.company_v_new;

import practice.company_v_new.model.Employee;
import practice.company_v_new.model.Manager;
import practice.company_v_new.model.SalesManager;
import practice.company_v_new.model.Worker;

public class EmployeeAppl  {
    public static void main(String[] args) {

        Employee[] empl = new Employee[4];
        empl[0] = new Manager(101, "John", "Smith", 45, 180, 10, "University", 5000, 6);
        empl[1] = new SalesManager(102, "Anna", "Black", 30, 160, 6.7, "School", 3000, 4);
        empl[2] = new SalesManager(103, "Thomas", "White", 28, 160, 6.7, "College", 2500, 3);
        empl[3] = new Worker(104, "Gans", "Bauer", 30, 120, 3, "School", 3);


        double total = totalSalary(empl); // вызываем метод для расчета зарплаты
        System.out.println("TOTAL SALARY: " + total);
        double average = averageAge(empl);
        System.out.println("Avarage Age: " + average);
        double totalSales = totalSales(empl);
        System.out.println(totalSales);
        int print = printAllEmployee(empl);

      /*  Comparator<Employee>  ComparatorByExperience = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getExperience(), o2.getExperience());
            }
        };

        System.out.println("============= Sort by experience ============== ");
        for (Employee e : empl){
            System.out.println(e);
        }
        Comparator<Employee>  ComparatorByEducation = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o2.getLevelOfEducation().compareTo(o1.getLevelOfEducation()));
            }
        };
        System.out.println("============= Sort by level education ============== ");
        for (Employee e : empl){
            System.out.println(e);
        }
*/

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
        }
        return sum;
    }

    private static int printAllEmployee(Employee[] empl) {
        for (int i = 0; i < empl.length; i++) {
            System.out.println(empl[i]);

        }
        return 0;
    }



}