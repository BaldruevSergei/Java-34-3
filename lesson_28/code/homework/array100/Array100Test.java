package homework.array100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Array100Test {
Array100 array100;
    @BeforeEach
    void setUp() {
        array100 = new Array100();
    }

    @Test
    void arraySerchPozitiv(){
        int array[] = {1,2,3,4,6,-10,0,-1,20,10,-19};
        assertEquals(8,array100.arraySerchPozitiv(array));

    }

    @Test
    void arraySerchNegativ() {
        int array[] = {1,2,3,4,6,-10,0,-1,-10,-99};
        assertEquals(4,array100.arraySerchNegativ(array));

    }

    @Test
    void arraySerchDigit() {
        int array[] = {1,2,3,4,6,-10,0,-1,0,60,2,8,6};
        assertEquals(10,array100.arraySerchDigit(array));

    }

    @Test
    void arraySerchNoDigit() {
        int array[] = {1,2,3,4,6,-10,0,-1,-9,7,25,99,98};
        assertEquals(7,array100.arraySerchNoDigit(array));

    }
}