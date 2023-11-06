package practice.company_v2.model;

public class SalesManager7 extends Employee7 {
    double salesValue;
    double percent;

    public SalesManager7(int id, String firstName, String lastName, int age, double hours, double salesValue, double percent) {
        super(id, firstName, lastName, age, hours);
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