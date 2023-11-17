package practice.supermarket1111.dao;

import practice.supermarket1111.model.Product;

public interface Supermarket extends Iterable <Product>{


    boolean addProduct(Product product);

    Product removeProduct(long barCode);

    Product findByBarCode(long barCode);

    Iterable<Product> findByCategory(String category);

    Iterable<Product> findByBrand(String brand);

    Iterable<Product> findProductsWithExpiredDate();

    int skuQuantity(); // кол-во складских единиц, 1 продукт = 1 sku

}
