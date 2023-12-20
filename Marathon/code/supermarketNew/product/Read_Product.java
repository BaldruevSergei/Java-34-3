package supermarketNew.product;

import supermarketNew.product.dao.Supermarket1Impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

public class Read_Product {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./dest/product.dat"))) {
            // deserializing from stream of bytes to object
            HashSet<Supermarket1Impl> set = (HashSet<Supermarket1Impl>)(ois.readObject());
            set.forEach(System.out::println); //
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}



