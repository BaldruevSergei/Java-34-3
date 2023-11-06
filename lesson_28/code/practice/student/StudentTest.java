package practice.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class StudentTest {
    Student student;
    @BeforeEach
    void setUp() {
        student = new Student();

    }

    @Test
    @DisplayName("В этом ТЕСТЕ мы тестируем расчет среднего балла")
    void averageMark() {
        int[] marks = {1,2,3,4,5,5,3,6};
        assertEquals(3.625,student.averageMark(marks));

    }


}