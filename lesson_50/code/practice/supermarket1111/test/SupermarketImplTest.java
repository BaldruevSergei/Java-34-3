package practice.supermarket1111.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.supermarket1111.dao.Supermarket;
import practice.supermarket1111.dao.SupermarketImpl;
import practice.supermarket1111.model.Product;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {
    Supermarket supermarket;
    Product[] e;

    @BeforeEach


    void setUp() {

        LocalDate now = LocalDate.now();
        supermarket = new SupermarketImpl();
        e = new Product[4];
        e[0] = new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        e[1] = new Product(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));
        e[2] = new  Product(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        e[3] = new  Product(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85));
        for (int i = 0; i < e.length; i++) {
             supermarket.addProduct(e[i]);
        }



    }

    @Test
    void testaddProduct() {
        // не можем добавить null - пустой объект
         assertFalse(supermarket.addProduct(null));
        // не можем добавить второй раз, уже существующий продукт
        assertFalse(supermarket.addProduct(e[1]));
        for (Product a : supermarket
             ) {
            System.out.println(a);
        }
        // добавили новый продукт
       Product product1 = new Product(55555,"MilSun","Milk", "Farmer", 3,LocalDate.now());
        assertTrue(supermarket.addProduct(product1));
        System.out.println("===========================");
        for (Product a : supermarket
        ) {
            System.out.println(a);
        }
        assertEquals(5,supermarket.skuQuantity());
    }

    @Test
    void testremoveProduct() {
        // удаляем продукт
        System.out.println("===========================");
        for (Product a : supermarket
        ) {
            System.out.println(a);
        }
        assertEquals(e[2],supermarket.removeProduct(333333));
        assertEquals(3,supermarket.skuQuantity()); // продуктов стало на 1 меньше
        assertNull(supermarket.removeProduct(333333)); // дважды не можем удалить один и тот же продукт
        assertNull(supermarket.findByBarCode(333333));
        System.out.println("===========================");
        for (Product a : supermarket
        ) {
            System.out.println(a);
        }
    }

    @Test
    void testfindByBarCode() {
        System.out.println("===========================");
        for (Product a : supermarket
        ) {
            System.out.println(a);
        }
        assertEquals(e[0], supermarket.findByBarCode(111111)); // нашли первый продукт
        assertNull(supermarket.findByBarCode(666666)); // ищем несуществующий продукт

    }
    @Test
    void testfindByCategory() {
        System.out.println("===========================");
        for (Product a : supermarket
        ) {
         System.out.println(a);
        }
        System.out.println("===========================");
        Iterable<Product> res = supermarket.findByCategory("Dairy");
         int count = 0;
        for (Product p : res) {
            assertEquals("Dairy", p.getCategory()); // cчитаем все продукты под категорией  "Dairy"
            System.out.println(p);
            count++;
        }

       assertEquals(3, count); //  под категорией  "Dairy" - 3 продукта
        }




    @Test
    void findByBrand() {
        System.out.println("===========================");
        for (Product a : supermarket
        ) {
            System.out.println(a);
        }
        System.out.println("===========================");
        Iterable<Product> res = supermarket.findByBrand("MilkLand");
        int count = 0;
        for (Product p : res) {
            assertEquals("MilkLand", p.getBrand());// считаем все продукты под брендом  "MilkLand"
            System.out.println(p);
            count++;
        }

        assertEquals(2, count); //  под  брендом  "MilkLand" - 2 продукта


    }

    @Test
    void findProductsWithExpiredDate() {
        System.out.println("===========================");

        Iterable<Product> res = supermarket.findProductsWithExpiredDate(); //ищем все продукты  с датой
        res = supermarket.findProductsWithExpiredDate();
        int count = 0;
        LocalDate now =LocalDate.now();
        for (Product p : res) {
            System.out.println(p);
            assertTrue(p.getDate().isBefore(now.minusDays(1))); //ищем все продукты  с датой до вчера(Now + 1 day)
            count++;
    }
            assertEquals(1,count);

    }


    @Test
    void skuQuantity() {
    }

    @Test
    void iterator() {
    }
}
