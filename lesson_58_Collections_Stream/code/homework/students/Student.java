package homework.students;

// Задача 1. По аналогии с классом User создать класс Student с полями: id, firstName, lastName, birthDay, course,
// groupNum (номер группы), country, gender(пол).
public class Student {
    // fields
    private  int id;
    private String firstName;
    private  String lastName;
    private int birthDay;
    private  String  course;
    private  int groupNum;
    private String country;
    private  String gender;
    //  constructor

    public Student(int id, String firstName, String lastName, int birthDay, String course, int groupNum, String country, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtDay=" + birthDay +
                ", course='" + course + '\'' +
                ", groupNum=" + groupNum +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
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

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    @Override
    public int hashCode() {
        return id;
    }


}
