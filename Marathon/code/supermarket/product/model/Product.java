package supermarket.product.model;

public class Product {
    private long barcode;
    private String name;
    private double price;

    public Product(long barcode, String name, double price) {

        this.barcode = barcode;
        this.name = name;
        this.price = price;
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

    public Product setPrice(double i) {
        this.price = this.price;
        return null;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barcode=" + barcode +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return barcode == product.barcode;
    }

    @Override
    public int hashCode() {
        return (int) (barcode ^ (barcode >>> 32));
    }


}
