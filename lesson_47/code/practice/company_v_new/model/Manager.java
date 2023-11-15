package practice.company_v_new.model;

public class Manager extends Employee{
    private double baseSalary;
    private int grade;

    public Manager(int id, String firstName, String lastName, int age, double hours, double experience, String levelOfEducation, double baseSalary,int grade) {
        super(id, firstName, lastName, age, hours, experience, levelOfEducation);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }


    @Override
    public double calcSalary() {
        double salary = baseSalary + grade * hours;
        return salary;
    }
}
//  this.baseSalary = baseSalary;
//        this.grade = grade;