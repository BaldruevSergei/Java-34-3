package practice.fibonacci;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    int quantity = 0;
    int cursor = 0;
    int a = 0;
    int b =1;

    public FibonacciIterator(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean hasNext() {
        return cursor < quantity ; // TODO проверка на количество числе в ряду
    }

    @Override
    public Integer next() {
        cursor++;
        int temp = a;
        a = b;
        b = b + temp;
        return a;
         // TODO - как получить следующее число Фибоначчи  в ряду = предыдущее + текущее
    }
}
