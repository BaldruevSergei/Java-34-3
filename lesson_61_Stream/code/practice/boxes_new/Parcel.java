package practice.boxes_new;

import java.util.Objects;

public class Parcel {
    private double weight;

    public Parcel(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        homework.box.Parcel parcel = (homework.box.Parcel) o;
        return Double.compare(weight, parcel.getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                '}';
    }
}

