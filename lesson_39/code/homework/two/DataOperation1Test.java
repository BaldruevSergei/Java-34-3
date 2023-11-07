package homework.two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DataOperation1Test {

    @BeforeEach
    void setUp() {

    }

    @Test
    void sortStringDates() {
        String[] str = {"2019/08/12", "2009/11/01", "1999/10/05" };
        String[] expected = {"1978/04/30", "2018/08/11" ,"2019/11/12"};
        String[] actual = DataOperation1.sortStringDates(str);
        assertArrayEquals(expected,actual);
    }
}