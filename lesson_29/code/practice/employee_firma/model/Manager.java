package practice.employee_firma.model;

import practice.company.model.Employee;

public class Manager extends Employee {
    private double baseSalary;
    private int grade;

    public Manager(int id, String firstName, String lastName, int age, double hours, double baseSalary, int grade) {
        super(id, firstName, lastName, age, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + grade * hours;
        return salary;
    }
}
