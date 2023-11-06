package practice.company_v2.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company_v2.dao.Company7;
import practice.company_v2.model.Employee;
import practice.company_v2.model.Manager;
import practice.company_v2.model.SalesManager;
import practice.company_v2.model.Worker;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImpl7Test {
    Company7 company;
    Employee[] e;

    @BeforeEach
    void setUp() {
     //   company = new CompanyImpl7(5);
        e = new Employee[4];
        e[0] = new Manager( 101, "John", "Smith", 45, 160, 5000, 5);
        e[1] = new SalesManager(102,"Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager(103,"Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker(104, "Gans", "Bauer", 30, 80, 5);

        //добавим эелементы массива "Е" в company
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }
    }

    @Test
    void addEmployeeTest() {
        // не можем добавить null
    //    assertFalse(company.addEmployee(null));
        // не можем добавить второй раз, уже существующий
        assertFalse(company.addEmployee(e[1]));
        Employee employee1 = new Manager(105, "Ivan", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertTrue(company.addEmployee(employee1)); // добавили нового сотрудника
        assertEquals(5, company.quantity()); // теперь в компании 5 сотрудников
        // создаем еще одного нового
        Employee employee2 = new Manager(106, "Peter", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertFalse(company.addEmployee(employee2)); // не можем превысить capacity
    }

    @Test
    void removeEmployeeTest() {
        // удаляем сотрудника
        company.printEmployee();
        System.out.println("_________________________________");
        assertEquals(e[1] ,company.removeEmployee(102));
        assertEquals(3, company.quantity()); // сотрудников стало на 1 меньше (4 - 1)
        assertNull(company.removeEmployee(102)); // дважды не можем удалить
        assertNull(company.findEmployee(102)); // не можем найти после удаления
        company.printEmployee();
    }

    @Test
    void findEmployeeTest() {
        company.printEmployee();
        // ищем сотрудника по id
        Assertions.assertEquals( e[1], company.findEmployee(102));
        // ищем несуществующего сотрудника
        assertNull(company.findEmployee(105));
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void totalSalaryTest() {
        assertEquals(12100, company.totalSalary());


    }

    @Test
    void avgSalaryTest() {
        assertEquals( 12100.0 / 4.0, company.avgSalary(), 0.01);


    }

    @Test
    void totalSalesTest() {
        assertEquals(55000, company.totalSales());

    }

    @Test
    void printEmployees() {
        company.printEmployee();


    }

    @Test
    void findEmployeesHoursGreaterThanTest() {
        Employee[] actual = new Employee[]{company.findEmployee(100)};
        Employee[] expected = {e[0], e[1], e[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeesSalaryRangeTest() {
        company.printEmployee();
        Employee[] actual = new Employee[]{company.findEmployee(2900)};
        Employee[] expected = {e[0],  e[2]};
        assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));


    }

}