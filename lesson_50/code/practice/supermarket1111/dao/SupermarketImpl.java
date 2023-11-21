package practice.supermarket1111.dao;

import practice.supermarket1111.model.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket {
    private Collection<Product> products = new ArrayList<>(); // List или ArrayList
    // O(n)
    @Override
    public boolean addProduct(Product product) {
        if(product == null || products.contains(product)){
            return false;
        }
        return products.add(product);
    }
    // O(n)
    @Override
    public Product removeProduct(long barCode) {
        Product removed = findByBarCode(barCode); // нашли продукт по баркоду
        products.remove(removed); // удалили из списка
        return removed; // вернули из метода тот, которы удалили
    }
    // O(n)
    @Override
    public Product findByBarCode(long barCode) {
        for (Product p : products) {
            if(p.getBarCode() == barCode){
                return p;
            }
        }
        return null;
    }
    // O(n)
    @Override
    public Iterable<Product> findByCategory(String category) {
        return findByPredicate(p -> category.equalsIgnoreCase(p.getCategory()));
    }
    // O(n)
    @Override
    public Iterable<Product> findByBrand(String brand) {
        return findByPredicate(p -> brand.equalsIgnoreCase(p.getBrand()));
    }
    // O(n)
    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        LocalDate currentDay = LocalDate.now();
        return findByPredicate(p -> currentDay.isAfter(p.getDate()));
    }
    // O(n)
    private Iterable<Product> findByPredicate(Predicate<Product> predicate){
        List<Product> res = new ArrayList<>();
        // перебираем весь список продуктов, находим те, которые удовлетворяют условию предиката
        for (Product p : products) {
            if(predicate.test(p)) {
                res.add(p);
            }
        }
        return res;
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator(); // берем итератор от ArrayList
    }
}