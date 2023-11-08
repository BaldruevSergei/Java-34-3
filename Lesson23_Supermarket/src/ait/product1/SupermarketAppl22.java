package ait.product1;

import ait.product1.dao.Supermarket22;
import ait.product1.model.Food23;
import ait.product1.model.Product22;

public class SupermarketAppl22 {
    public static void main(String[] args) {
        Supermarket22 kiosk = new Supermarket22(4);
        kiosk.addProduct(new Product22(1000,"Gift card", 20));
        //System.out.println(kiosk.getQuantity());
        kiosk.addProduct(new Food23(2000, "Sausages",5,"20.10.2023", false));
        //System.out.println(kiosk.getQuantity());
        kiosk.addProduct(new Food23(3000, "Goat cheese", 13,"31.12.2023", true));
        //kiosk.addProduct(null);
        boolean check = kiosk.addProduct(new Food23(4000, "Pork fat", 3, "15.11.2023", true));
        //System.out.println(check);
        check = kiosk.addProduct(new Product22(5000, "Book",5));
        //System.out.println(kiosk);
        kiosk.printAllProducts();
        System.out.println("=======================================================");
        //Product product = kiosk.findProduct(4000);
       // System.out.println(product);

        //System.out.println(kiosk.updateProduct(4000,100));
        //kiosk.printAllProducts();
        //kiosk.removeProduct(5000);
        kiosk.removeProduct(1000);
        kiosk.printAllProducts();

    }
}
