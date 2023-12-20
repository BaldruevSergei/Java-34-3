package homework.yachts;
//Задание 1. Создать класс «Яхта». В классе должна храниться следующая информация:
//
//производитель(верфь);
//год выпуска;
//длина;
//материал корпуса (дерево, пластик, металл);
//стоимость.
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Yaht {
    int id;
    String manufacturer;
    int year;
    double length;
    String material;
    double price;
    // constr
    public Yaht(int id, String manufacturer, int year, double length, String material, double price) {
        System.out.println("Constructor is working");
        this.id = id;
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.material = material;
        this.price = price;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Yaht{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yaht yaht = (Yaht) o;
        return id == yaht.id && year == yaht.year && Double.compare(length, yaht.length) == 0 && Double.compare(price, yaht.price) == 0 && Objects.equals(manufacturer, yaht.manufacturer) && Objects.equals(material, yaht.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, year, length, material, price);
    }
}
