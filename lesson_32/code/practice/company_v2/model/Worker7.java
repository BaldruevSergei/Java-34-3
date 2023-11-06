package practice.company_v2.model;

public class Worker7 extends  Employee7{
    double grade;

    public Worker7(int id, String firstName, String lastName, int age, double hours, double grade) {
        super(id, firstName, lastName, age, hours);
        this.grade = grade;
    }

    public Worker7(int id, String firstName, String lastName, int age, double hours) {
        super(id, firstName, lastName, age, hours);
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



