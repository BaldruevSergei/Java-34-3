package practice.company_stream1.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company_stream1.dao.Company1;
import practice.company_stream1.dao.CompanySetImpl1;
import practice.company_stream1.model.Employee1;
import practice.company_stream1.model.Manager1;
import practice.company_stream1.model.SalesManager1;
import practice.company_stream1.model.Worker1;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company1 company1;
    static final LocalDate now = LocalDate.now();


    @BeforeEach
    void setUp() {
        company1 = new CompanySetImpl1(5);
        company1.addEmployee(new Manager1(101, "John", "Smith", 45, 160, 5000, 5));
        company1.addEmployee(new SalesManager1(102, "Anna", "Black", 36, 160, 25000, 0.1));
        company1.addEmployee(new SalesManager1(103, "Thomas", "White", 28, 160, 30000, 0.1));
        company1.addEmployee(new Worker1(104, "Gans", "Bauer", 30, 80, 5));


    }

    @Test
    void addEmployee() {
        // не можем добавить null - пустой объект
        //assertFalse(company1.addEmployee(null);
        // не можем добавить второй раз, уже существующего работника
        //*assertFalse(company.addEmployee(new Manager(101, "John", "Smith", 45, 160, 5000, 5)));
        Employee1 employee = new Manager1(105, "Ivan", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertTrue(company1.addEmployee(employee)); // добавили нового сотрудника
        assertEquals(5, company1.quantity()); // теперь в компании 5 сотрудников
        // создаем еще одного нового
        Employee1 employee2 = new Manager1(106, "Peter", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertFalse(company1.addEmployee(employee2)); // не можем превысить capacity
        company1.printEmployees();//*
    }

    @Test
    void removeEmployee() {
        // удаляем сотрудника
        company1.printEmployees();
        System.out.println("---------------------");
        //assertEquals(e[1], company.removeEmployee(102));
        assertEquals(3, company1.quantity()); // сотрудников стало на 1 меньше (4 - 1)
        assertNull(company1.removeEmployee(102)); // дважды не можем удалить
        assertNull(company1.findEmployee(102)); // не можем найти после удаления
        company1.printEmployees();
    }

    @Test
    void findEmployee() {
        company1.printEmployees();
        // ищем сотрудника по id
        //assertEquals(e[1], company.findEmployee(102));
        // ищем несуществующего сотрудника
        assertNull(company1.findEmployee(105));
    }

    @Test
    void quantityTest() {
        assertEquals(4, company1.quantity());

    }

    @Test
    void totalSalaryTest() {
        assertEquals(11700., company1.totalSalary(), 0.01);
    }

    @Test
    void avgSalaryTest() {
        assertEquals(11700.0 / 4, company1.avgSalary(), 0.01);
    }

    @Test
    void totalSalesTest() {
        assertEquals(55000, company1.totalSales());
    }

    @Test
    void printEmployeesTest() {

        company1.printEmployees();
    }

    @Test
    void findEmployeesHoursGreaterThanTest() {
        Employee1[] actual = company1.findEmployeesHoursGreaterThan(100);
        // Arrays.sort(actual, comparator); // сортировка по id сотрудников
        // Employee[] expected = {e[0], e[1], e[2]};
        // assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeesSalaryRangeTest() {
        company1.printEmployees();
        Employee1[] actual = company1.findEmployeesSalaryRange(2900, 6000);
        // Arrays.sort(actual, comparator); // сортировка по id сотрудников
        // Employee[] expected = {e[0], e[2]};
        // assertArrayEquals(expected, actual);
        // System.out.println(Arrays.toString(actual));
    }
}
