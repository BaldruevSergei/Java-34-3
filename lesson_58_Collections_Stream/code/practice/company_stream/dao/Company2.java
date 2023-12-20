package practice.company_stream.dao;

import practice.company_stream.model.Employee3;
import practice.company_stream1.model.Employee;

public interface Company2 {
    // объявляем методы, только сигнатуры, без тела метода
    boolean addEmployee(Employee employee);

    // O(1)
    boolean addEmployee(Employee3 employee);

    Employee3 removeEmployee(int id);
    Employee3 findEmployee(int id);
    int quantity();
    double totalSalary(); // - ФОТ, зарплата всех
    double avgSalary(); // средняя зарплата по компании, average - средний
    double totalSales(); // - объем продаж
    void printEmployees();
    //---------------------
//      - список работников, у которых отработано больше часов, чем...
    Employee[] findEmployeesHoursGreaterThan(int hours);
    //      - список работников, у которых зарплата в интервале от... и до...
    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);

}

