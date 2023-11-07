package homework.one;

import homework.two.DataOperation1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataOperationTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void getAge() {
        assertEquals(45, DataOperation.getAge("30.04.1978"));
        assertEquals(45, DataOperation.getAge1("1978-04-30"));
    }
}