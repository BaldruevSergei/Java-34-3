package practice.company_v_new;

import practice.company_v_new.model.Employee;
import practice.company_v_new.model.Manager;
import practice.company_v_new.model.SalesManager;
import practice.company_v_new.model.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeApplNew implements Comparator {
    public static void main(String[] args) {

        List<Employee> empl = new ArrayList<>();

        empl.add(new Manager(101, "John", "Smith", 45, 180, 10, "University", 5000, 6));
        empl.add( new SalesManager(102, "Anna", "Black", 30, 160, 6.7, "School", 3000, 4));
        empl.add( new SalesManager(103, "Thomas", "White", 28, 160, 6.7, "College", 2500, 3));
        empl.add(new Worker(104, "Gans", "Bauer", 30, 120, 3, "School", 3));



       Comparator<Employee>  ComparatorByExperience = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getExperience(), o2.getExperience());
            }
        };
        empl.sort(ComparatorByExperience);
        System.out.println("============= Sort by experience ============== ");
        for (Employee e : empl){
            System.out.println(e);
        }
        Comparator<Employee>  ComparatorByEducation = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getLevelOfEducation().compareTo(o2.getLevelOfEducation()));
            }
        };
        empl.sort(ComparatorByEducation);
        System.out.println("============= Sort by level education ============== ");
        for (Employee e : empl){
            System.out.println(e);
        }


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


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}


