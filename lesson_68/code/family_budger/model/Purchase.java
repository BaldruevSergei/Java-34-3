package family_budger.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Purchase implements  Comparable<Purchase> {
    private int id;
    private LocalDate date;
    private double totalCost;
    private String store;
    private String person;
    private List<Product> product;
    public Purchase(int id, LocalDate date, double totalCost, String store, String person, String product) {
        this.id = id;
        this.date = date;
        this.totalCost = totalCost;
        this.store = store;
        this.person = person;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return id == purchase.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Purchare{" +
                "id=" + id +
                ", dateate=" + date +
                ", totalCost=" + totalCost +
                ", store='" + store + '\'' +
                ", person='" + person + '\'' +
                ", product='" + product + '\'' +
                '}';
    }

    @Override
    public int compareTo(Purchase o) {
        return this.date.compareTo(o.getDate());
    }
}
