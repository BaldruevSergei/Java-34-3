package practice.fibonacci;

import java.util.Iterator;

public class FibanacciIterator implements Iterator<Integer> {

    @Override
    public boolean hasNext() {
        return false; // TODO проверка на количество числе в ряду
    }

    @Override
    public Integer next() {
        return null; // TODO - как получить следующее число Фибоначчи  в ряду = предыдущее + текущее
    }
}
