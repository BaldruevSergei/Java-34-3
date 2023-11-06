package practice.employee;

import practice.employee.model.Employee;

public class FirmaAppl {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Jhon", "Smitn", 36, 24000, true);

        Employee emp2 = new Employee(2, "Mary", "Poppins", 35, 24000, false);


        emp1.display();
        emp2.display();


        double totalSalary = emp1.getSalary() + emp2.getSalary();
        System.out.println("Total salary  " + totalSalary);

        emp1.work();

    }
}
