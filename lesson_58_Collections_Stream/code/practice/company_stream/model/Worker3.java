package practice.company_stream.model;

public class Worker3 extends Employee3 {
    private double grade;

    public Worker3(int id, String firstName, String lastName, int age, double hours, double grade) {
        super(id, firstName, lastName, age, hours);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = hours * grade;
        return salary;
    }
}

