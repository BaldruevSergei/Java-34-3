package practice.company_v_new.model;

public abstract class Employee {
    // поля класса
    protected  final int id;
    protected String  firstName;
    protected String lastName;
    protected  int age;
    protected double hours;
    protected double experience;
    protected String levelOfEducation;
    // TODO

    // конструктор

    public Employee(int id, String firstName, String lastName, int age, double hours, double experience, String levelOfEducation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hours = hours;
        this.experience=experience;
        this.levelOfEducation = levelOfEducation;
    }


    public int getId() {
        return id;
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

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    public double getExperience(){return experience;}
    public  void setExperience(double experience){this.experience = experience;}
    public  String getLevelOfEducation(){return levelOfEducation;}
    public void setLevelOfEducation(String levelOfEducation){this.levelOfEducation = levelOfEducation;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employee ");
        sb.append("id = ").append(id);
        sb.append(" firstName=").append(firstName).append('\'');
        sb.append(" lastName=").append(lastName).append('\'');
        sb.append(" hours=").append(hours);
        sb.append(" experience=").append(experience);
        sb.append(" levelOfEducation=").append(levelOfEducation);
        sb.append(" salary=").append(calcSalary());
        return sb.toString();
    }

    public abstract double calcSalary();// определили абстрактный метод (у него нет тело)

}
