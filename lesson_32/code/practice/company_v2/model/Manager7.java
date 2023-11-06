package practice.company_v2.model;

public class Manager7 extends Employee7 {
    private double baseSalary;
    private int grade;

    public Manager7(int id, String firstName, String lastName, int age, double hours,double baseSalary, int grade ) {
        super(id, firstName, lastName, age, hours);
        this.baseSalary =baseSalary;
        this.grade = grade;
    }


    @Override
    public double calcSalary() {
        double salary = baseSalary + grade * hours;
        return salary;
    }
}
