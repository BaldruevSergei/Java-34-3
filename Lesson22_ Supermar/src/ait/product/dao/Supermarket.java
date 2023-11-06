package ait.product.dao;

import ait.product.model.Product;

public class Supermarket {
    private Product[] products;
    private int quantity;

    public Supermarket(int capacity) {
        products = new Product[capacity];
    }

    public boolean addProduct(Product product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {
            return false;
        }
        products[quantity] = product;
        quantity++;
        return true;
    }

    public Product findProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                return products[i];
            }
        }
        return null;
    }

    public Product updateProduct(long barcode, double price) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                products[i].setPrice(price);
                return products[i];
            }
        }

        // TODO update product price
        return null;
    }

    public boolean removeProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                int index = i;
                for (int j = index; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                    products[j+1] = 0;
                }
            }



        } return false;
    }


        // TODO remove product





    public void printAllProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }
}
