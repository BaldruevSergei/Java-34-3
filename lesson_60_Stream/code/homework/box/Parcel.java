package homework.box;

public class Parcel {
    // Создайте класс Parcel (посылка) с полем double weight - вес посылки
    double weight;

    public Parcel(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                '}';
    }


}
