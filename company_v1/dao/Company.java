package practice.company_v2.dao;
//- добавить сотрудника
//- удалить сотрудника
//- найти сотрудника
//- кол-во сотрудников
//- ФОТ
//- средняя з/п
//- объем продаж
//- напечатать список сотрудников


import practice.company_v2.model.Employee;

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

}
