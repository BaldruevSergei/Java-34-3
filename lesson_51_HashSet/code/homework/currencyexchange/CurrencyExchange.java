package homework.currencyexchange;

public enum CurrencyExchange {
    USD(1, "USD", 1.09), CHF(2, "CHF", 1.03), GBP(3, "GBP", 1.14), EUR(4, "EUR", 1);
    private  int number;
    private String name;
    private double course;

    CurrencyExchange(int number, String name, double course) {
        this.number = number;
        this.name = name;
        this.course = course;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return  number +   " : Currency name " + name  + ", course = " + course;
    }
}
