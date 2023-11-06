package homework.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();

    }

    @Test
    void addition() {
        int a = 5;
        int b = 4;
        assertEquals(9,calculator.addition(a,b));
    }

    @Test
    void substraction() {
        int a = 5;
        int b = 4;
        assertEquals(1,calculator.substraction(a,b));
    }

    @Test
    void multiplication() {
        int a = 5;
        int b = 4;
        assertEquals(20,calculator.multiplication(a,b));
    }

    @Test
    void division() {
        int a = 5;
        int b = 4;
        assertEquals(1,calculator.division(a,b));
    }

    @Test
    void divisionRemainder() {
        int a = 4;
        int b = 5;
        assertEquals(4,calculator.DivisionRemainder(a,b));
    }
}