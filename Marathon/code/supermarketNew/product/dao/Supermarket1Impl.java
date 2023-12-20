package supermarketNew.product.dao;

import supermarketNew.product.model.Product1;

import java.io.Serializable;

public class Supermarket1Impl implements Serializable {


    private Product1[] products;
    private int quantity;

    public Supermarket1Impl(int capacity) {
        products = new Product1[capacity];
    }


    public boolean addProduct(Product1 product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {
            return false;
        }
        products[quantity] = product;
        quantity++;
        return true;
    }

    public Product1 findProduct(long barcode) {
        // TODO find Product by barcode
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                return products[i];
            }
        }
        return null;
    }


    public Product1 updateProduct(long barcode, double price) {

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                products[i].setPrice(price);
                return products[i];
            }


        }
        return null;
    }


// TODO update Product price

    // TODO remove product
    public boolean removeProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                if (i < products.length - 1) { // условие когда удалемый элемент не последний
                    int index = i;          // сдвигаем и на его место перемещаем последующий
                    for (int j = index; j < products.length - 1; j++) {
                        products[j] = products[j + 1];
                        products[j + 1] = null;
                    }


                } else {                   // условие когда удаляемый элемент последний
                    products[i] = null;    // сразу обнуляем ячейку выполняем перемещение элементов к началу,
                    // в результате чего пустая ячейка окажется в конце
                    int x = i;
                    for (int k = x; k < products.length - 1; k++) {
                        products[x - 1] = products[x];
                        products[x] = null;
                    }
                }
            }

        }
        return false;
    }

    public boolean removeProduct1(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                products[i] = products[quantity - 1]; // последний элемент массива ставим на место удаляемого
                products[quantity - 1] = null; // обнуляем последний элемент
                quantity--; //
                return true;
            }
        }
        return false;
    }


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

