package practice;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonacciSample {
    public static Iterable<BigInteger> fibonacci(final long N) {
        return () -> new Iterator<BigInteger>() {
            private long cursor = 0;
            private BigInteger a = BigInteger.ZERO,
                    b = BigInteger.ONE;
            public boolean hasNext() {
                return cursor < N;
            }
            public BigInteger next() {
                ++cursor;
                final BigInteger temp = a;
                a = b;
                b = b.add(temp);
                return a;
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(final String[] args) {
        for (BigInteger e: fibonacci(8)) {
            System.out.println(e);
        }
    }
}
