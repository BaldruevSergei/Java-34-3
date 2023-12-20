package car_garage.dao;

import car_garage.model.Car;

import java.util.HashSet;
import java.util.Set;

public class GarageStreamImpl implements Garage{

    private Set<Car> cars; // для объектов типа Car
    private int size; // текущее кол-во автомобилей в массиве
    private int capacity; // максимальное кол-во автомобилей

    public GarageStreamImpl(int capacity) {
        cars = new HashSet<>();
        this.size = 0;
        this.capacity = capacity;
    }

    @Override
    public boolean addCar(Car car) {
         // открыли stream
        return false;
    }

    @Override
    public Car removeCar(String regNumber) {
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return new Car[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
