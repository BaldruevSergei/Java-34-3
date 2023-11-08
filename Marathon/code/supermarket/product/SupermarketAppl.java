package supermarket.product;

import supermarket.product.dao.Supermarket;
import supermarket.product.model.Food;
import supermarket.product.model.Product;

public class SupermarketAppl {
    public static void main(String[] args) {
        Supermarket kiosk = new Supermarket(4);
        kiosk.addProduct(new Product(1000,"Gift card", 20));
        //System.out.println(kiosk.getQuantity());
        kiosk.addProduct(new Food(2000, "Sausages",5,"20.10.2023", false));
        //System.out.println(kiosk.getQuantity());
        kiosk.addProduct(new Food(3000, "Goat cheese", 13,"31.12.2023", true));
        //kiosk.addProduct(null);
        boolean check = kiosk.addProduct(new Food(4000, "Pork fat", 3, "15.11.2023", true));
        //System.out.println(check);
        check = kiosk.addProduct(new Product(5000, "Book",5));
        //System.out.println(kiosk);
        kiosk.printAllProducts();
        System.out.println("=======================================================");
        //Product product = kiosk.findProduct(4000);
       // System.out.println(product);

        //System.out.println(kiosk.updateProduct(4000,100));
        //kiosk.printAllProducts();
        //kiosk.removeProduct(5000);
        kiosk.removeProduct1(1000);
        kiosk.printAllProducts();

    }
}
