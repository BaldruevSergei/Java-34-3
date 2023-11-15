package practice.company_v_new.model;

public class SalesManager extends Employee {
    private double salesValue;
    private double percent;

    public SalesManager(int id, String firstName, String lastName, int age, double hours, double experience, String levelOfEducation, double salesValue,double percent) {
        super(id, firstName, lastName, age, hours, experience, levelOfEducation);
       this.salesValue = salesValue;
        this.percent = percent;
    }




    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double calcSalary() {
        double saraly = salesValue * percent;
        return saraly;
    }
}
//this.salesValue = salesValue;
//        this.percent = percent;