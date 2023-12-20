package practice.company_stream1.dao;

import practice.company_stream1.model.Employee;
import practice.company_stream1.model.Employee1;
import practice.company_stream1.model.SalesManager1;

import java.util.ArrayList;
import java.util.List;

public class CompanyArrayListImpl1 implements Company1 {
    // поля, которые описывают компанию
//    private Employee[] employees; // сотрудники - массив для хранения сотрудников
//    private int size; // текущее кол-во сотрудников в компании

    List<Employee1> employees; // вместо массива делаем List
    int capacity; // вместимость компании

//    конструктор
//    public CompanyImpl(int capacity){
//        employees = new Employee[capacity]; // capacity - максимальный размер компании
//    }

    public CompanyArrayListImpl1(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new ArrayList<>(); // длину (размер) указывать не надо
    }

    // O(n)
    @Override
    public boolean addEmployee(Employee1 employee) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
//        if( employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
//            return false;
//        }
//        employees[size++] = employee; // ++ - это постфиксная операция
//        return true;
        if(employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee); // добавили в список сотрудника (элемент списка)
        return true;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    // O(n)
    @Override
    public Employee1 removeEmployee(int id) {
//        for (int i = 0; i < size; i++) {
//            if(employees[i].getId() == id){
//                Employee victim = employees[i]; // убрали найденный элемент в переменную
//                employees[i] = employees[--size]; // - префиксная операция
//                employees[size] = null; // обнуляем последний элемент
//                return victim;
//            }
//        }
//        return null;

        Employee1 victim = findEmployee(id);
        if (victim != null) { // а надо ли это проверять?
            employees.remove(victim);
            return victim;
        }
        return null;
    }

    // O(n)
    @Override
    public Employee1 findEmployee(int id) {
//        for (int i = 0; i < size; i++) {
//            if(employees[i].getId() == id){ // нашелся элемент массива, у которого совпал id
//                return employees[i]; // вернули найденный элемент массива типа Employee
//            }
//        }
//        return null;

        for (Employee1 e : employees) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }

    // O(1)
    @Override
    public int quantity() {
        return employees.size(); // вернули длину списка
    }

    // O(n)
    @Override
    public double totalSalary() {
        double res = 0;
//        for (int i = 0; i < size; i++) {
//            res += employees[i].calcSalary();
//        }
        for (Employee1 e : employees) {
            res += e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }

    // O(n)
    @Override
    public double totalSales() {
//
//        for (int i = 0; i < size; i++) {
//            if(employees[i] instanceof SalesManager){
//                SalesManager salesManager = (SalesManager) employees[i]; // провели кастинг
//                res += salesManager.getSalesValue();
//            }
//        }
//
        double res = 0;
        for (Employee1 e : employees) {
            if(e instanceof SalesManager1) {
                //    SalesManager salesManager = (SalesManager) e;
                res += ((SalesManager1) e).getSalesValue();
            }
        }
        return res;
    }

    // O(n)
    @Override
    public void printEmployees() {
       employees.forEach(e-> System.out.println(e));
        }



    @Override
    public Employee1[] findEmployeesHoursGreaterThan(int hours) {
//
//        // считаем сколько будет элементов массива, удовлетворяющих условию
//        for (int i = 0; i < size; i++) {
//            if(employees[i].getHours() > hours){
//                count++;
//            }
//        }
//        Employee[] res = new Employee[count]; // создаем массив размером count
//        // заполняем массив res
//        for (int i = 0, j = 0; j < res.length; i++) {
//            if(employees[i].getHours() > hours){
//                res[j++] = employees[i];
//            }
//        }
//        return res; // это возвращаемый массив

        int count = 0;
        for (Employee1 e : employees) {
            if(e.getHours() > hours) {
                count++;
            }
        }
        Employee1[] res = new Employee1[count]; // создаем массив размером count
        count = 0;
        for (Employee1 e : employees) {
            if(e.getHours() > hours){
                res[count] = employees.get(count);
                count++;
            }
        }
        return res;
    }

    // реализация от Кирилла Соколова
    // O(n)
    @Override
    // подсчет количества элементов, удовлетворяющих критерию
    public Employee1[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        // O(1)
        int count = 0;
        // O(n)
        for (Employee1 e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                count++;
            }
        }
        // O(1)
        Employee1[] res = new Employee1[count]; // создали новый массив
        count = 0;
        // O(n)
        for (Employee1 e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                res[count] = e;
                count = count + 1;
            }
        }
        return res;
    }

}