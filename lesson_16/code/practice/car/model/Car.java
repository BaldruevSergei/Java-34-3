package practice.car.model;

public class Car {
    // поля класса
    private String brand;
    private  String color;
    private  String model;
    private int year;
    private double enginePower;
    private String fuelType;

    // конструктор класса  Car

    public Car(String brand, String color, String model, int year, double enginePower, String fuelType) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
    }
//    гетерры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    // метод печати
    public void displayCar(){
        System.out.println("Brand : " + brand+ "Model" + model+ "engine " + enginePower);

    }
}
