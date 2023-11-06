package practice.beverage;

import practice.beverage.model.Beer;
import practice.beverage.model.Beverage;

public class BevergaAppl {
    public static void main(String[] args) {
        Beverage b1 = new Beverage("Milk", "Box", 10);
        b1.toBuy("Milk", "Box", 20);
        b1.displayStock();
        System.out.println("---------------------------------------------------");

        Beer b2 = new Beer("Auvgustino", "6 pack", 10,"elle");
        b2.toBuy("Auvgustiner", "6 pack", 10,"elle");
        b2.displayStock();


    }
}
