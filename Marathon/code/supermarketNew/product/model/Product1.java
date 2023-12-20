package supermarketNew.product.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Product1 implements Serializable {
    private long barcode;
    private String name;
    private double price;
    private LocalDateTime date;

    public Product1(long barcode, String name, double price, LocalDateTime date) {
        System.out.println("Constructor Product is working ");
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public long getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public LocalDateTime getDate(){return date;}

    public Product1 setPrice(double i) {
        this.price = this.price;
        return null;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barcode=" + barcode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date = " + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product1 product = (Product1) o;
        return barcode == product.barcode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode);
    }
}
