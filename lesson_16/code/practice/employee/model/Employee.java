package practice.employee.model;

public class Employee {

    // поля класса
    private int id; // идентификатор
    private String firstName;
    private  String lastName;
    private int age;
    private double salary; // зарплата

    private boolean genter; // пол


    // конструктор


    public Employee(int id, String firstName, String lastName, int age, double salary, boolean genter) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.genter = genter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isGenter() {
        return genter;
    }

    public void setGenter(boolean genter) {
        this.genter = genter;
    }

    public void display() {
        System.out.println("ID: " + id + ", first name: " + firstName + ", last name: "
                + lastName + ", salary: " + salary + ", gender: " + (genter ? "male" : "female"));

    }
    public void work () {
        System.out.println("Employee is working hard!...");
    }

    public void lunch () {
        System.out.println("Employee eating lunch");
    }

    public void sleep () {
        System.out.println("Employee is sleeping ...");
    }


}
