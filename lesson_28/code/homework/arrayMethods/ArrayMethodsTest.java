package homework.arrayMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
ArrayMethods arrayMethods;
    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    void arraySum() {
        int array[] = {1,-2, 5,-9};
        assertEquals(-5,arrayMethods.arraySum(array));

    }

    @Test
    void arraySerch() {
        int array[] = {1,2,3,4,5,6,7,10,-20};
        int s = 2;
        assertEquals(2,arrayMethods.arraySerch(s,array));


    }
}