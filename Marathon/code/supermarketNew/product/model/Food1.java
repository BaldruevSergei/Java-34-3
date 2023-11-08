package supermarketNew.product.model;

import java.time.LocalDateTime;

public class Food1 extends Product {
    private String expDate;
    private boolean organic;

    public Food1(long barcode, String name, double price, LocalDateTime date, String expDate, boolean organic) {
        super(barcode, name, price, date);
        this.expDate = expDate;
        this.organic = organic;
    }

    @Override
    public String toString() {
        return super.toString() + "Food{" +
                "expDate='" + expDate + '\'' +
                ", organic=" + organic +
                "} " + super.toString();
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }
}
