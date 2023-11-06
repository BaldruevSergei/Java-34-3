package practice.arrays.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {
    Comparator<String> comparator;
    @BeforeEach
    void setUp(){
        comparator = (s1, s2) ->{
    String[] date1 = s1.split("-");
    String[] date2 = s2.split("-");
            int res = date1[2].compareTo(date2[2]);
            res = res != 0 ? res : date1[1].compareTo(date2[1]);
            return res != 0 ? res : date1[0].compareTo(date2[0]);
            // TODO Homework. Don't use Java Time

        };
    }
    @Test
    void testdateSort(){
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
    }
}


