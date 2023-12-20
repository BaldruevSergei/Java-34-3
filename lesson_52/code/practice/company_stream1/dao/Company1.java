package practice.company_stream1.dao;

//    - добавить сотрудника
//    - удалить сотрудника
//    - найти сотрудника
//    - кол-во сотрудников
//    - ФОТ
//    - средняя з/п
//    - объем продаж
//    - напечатать список сотрудников

import practice.company_stream1.model.Employee;
import practice.company_stream1.model.Employee1;

public interface Company1 {
    // объявляем методы, только сигнатуры, без тела метода
    boolean addEmployee(Employee1 employee);

    // O(n)
    boolean addEmployee(Employee employee);

    Employee1 removeEmployee(int id);
    Employee1 findEmployee(int id);
    int quantity();
    double totalSalary(); // - ФОТ, зарплата всех
    double avgSalary(); // средняя зарплата по компании, average - средний
    double totalSales(); // - объем продаж
    void printEmployees();
    //---------------------
//      - список работников, у которых отработано больше часов, чем...
    Employee1[] findEmployeesHoursGreaterThan(int hours);
    //      - список работников, у которых зарплата в интервале от... и до...
    Employee1[] findEmployeesSalaryRange(int minSalary, int maxSalary);

}