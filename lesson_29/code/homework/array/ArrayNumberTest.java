package homework.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayNumberTest {
    ArrayNumber arrayNumber;

    @BeforeEach
    void setUp() {
        arrayNumber = new ArrayNumber();

    }

    @Test
    @DisplayName("В этом ТЕСТЕ мы тестируем расчет среднюю величину по модулю по всем четным элементам массива")
    void arraySumDigit() {
        int arr[] = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        assertEquals(18, arrayNumber.arraySumDigitABS(arr));
    }

    @Test
    @DisplayName("В этом ТЕСТЕ мы тестируем расчет среднюю величину по всем четным элементам массива")
    void arraySumDigit1() {
        int arr[] = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        assertEquals(2, arrayNumber.arraySumDigitNoABS(arr));
    }

    @Test
    @DisplayName("В этом ТЕСТЕ мы тестируем расчет среднюю величину  по модулю  по всем четным элементам массива")
    void arraySumDigit2() {
        int arr[] = {-5, 17, 23, -30, 22};
        assertEquals(-4, arrayNumber.arraySumDigitNoABS(arr));
    }

    @Test
    @DisplayName("В этом ТЕСТЕ мы тестируем расчет среднюю величину  по всем четным элементам массива")
    void arraySumDigit3() {
        int arr[] = {-5, 17, 23, -30, 22};
        assertEquals(26, arrayNumber.arraySumDigitABS(arr));
    }
}