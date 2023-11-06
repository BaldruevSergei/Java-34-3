package homework.student;

import homework.student.grup1.Student;

public class StudentAppl {
    public static void main(String[] args) {

        Student stud1 = new Student(1, "Roman", "Box", 2000, "IT");
        Student stud2 = new Student(2, "Jhon", "Gif", 1999, "Phisics");
        Student stud3 = new Student(3, "Sonya", "Craft", 1998, "Lnggluages");

        stud1.display();
        stud2.display();
        stud3.display();

        stud1.Study();
        stud3.Sleep();
        stud1.exam();
    }
}
