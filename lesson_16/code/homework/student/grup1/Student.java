package homework.student.grup1;

import homework.NumberMethods;

import java.util.Scanner;

public class Student {
    // поля класса

    private  int Id;
    private String FirstName;
    private String LastName;
    private int Year;
    private String Major;

    public Student(int id, String firstName, String lastName, int year, String major) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Year = year;
        Major = major;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public void display(){
        System.out.println("I d " + Id + " FirstName " + FirstName + " LastName " + LastName + " Year " + Year + "Major " + Major );
    }

    public void exam(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter day  ");
        int n = scanner.nextInt();
        System.out.println(" Your tiket number  " + n*25);
    }

    public void Study(){
        System.out.println("I'm ready study ");
    }
    public  void Sleep(){
        System.out.println("I want to sleep");
    }
}
