package practice.fibonacci;

import java.util.Iterator;

public class Fibonacci implements  Iterable<Integer>{

    private  int quantity; // колво чисел в последваотельности

    public int getQuantity() {
        return quantity;
    }

    public Fibonacci(int quantity) {

        this.quantity = quantity;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null; // TODO
    }
}
