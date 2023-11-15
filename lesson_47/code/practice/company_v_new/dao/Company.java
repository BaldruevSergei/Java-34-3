package practice.company_v_new.dao;
//- добавить сотрудника
//- удалить сотрудника
//- найти сотрудника
//- кол-во сотрудников
//- ФОТ
//- средняя з/п
//- объем продаж
//- напечатать список сотрудников


import practice.company_v_new.model.Employee;

public interface Company {
    // объявляем методы только сигнатуры без тела метода
    boolean addEmployee(Employee employee);
    Employee removeEmployee (int id);
    Employee findEmployee (int id);
    int quantity();
    double totalSalary(); // фонд оплаты труда зарлата всех
    double avgSalary(); // средняя зарплата
    double totalSales();
    void printEmployee();

    void printEmployees();

    Employee[] findEmployeesHoursGreaterThan(int hours);

    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);


    //      - список работников, у которых отработано больше часов, чем...


//      - список работников, у которых зарплата в интервале от... и до...
}
