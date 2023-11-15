package practice.company_v_new.dao;

import practice.company_v_new.model.Employee;
import practice.company_v_new.model.SalesManager;

import java.util.ArrayList;
import java.util.List;

public class CompanyArrayListImpl implements Company {

    List<Employee> employees; // вместо массива делаем List
    int capacity;

    public CompanyArrayListImpl(int capacity) {
        employees = new ArrayList<>(); // длину (размер) указывать не надо
        this.capacity = capacity; // это ограничения по кол-ву сотрудников компании
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
       /* if( employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }

        employees[size++] = employee; // ++ - это постфиксная операция
        return true;*/
        if (employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee); // добавили в список сотрудника
        return true;
    }

    // O(n)
    @Override
    public Employee removeEmployee(int id) {
       /* for (int i = 0; i < size; i++) {
           if(employees[i].getId() == id){
                Employee victim = employees[i]; // убрали найденный элемент в переменную
//                 employees[i] = employees[--size]; // - префиксная операция
                employees[size] = null; // обнуляем последний элемент
                return victim;
            }
        }
        return null;*/
        Employee victim = findEmployee(id);
        if (victim != null) { //   а надо ли это проверять?
            employees.remove(victim);
            return victim;
        }
        return null;

    }

// O(n)

    @Override
    public Employee findEmployee(int id) {
      /*  for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){ // нашелся элемент массива, у которого совпал id
                return employees[i]; // вернули найденный элемент массива типа Employee
            }
        }return null;*/

        for (Employee e : employees) { // e - это employees из списка
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }

        return null;
    }

    // O(1)
    @Override
    public int quantity() {
        return employees.size();
    }

    // O(n)
    @Override
    public double totalSalary() {
       /* double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();
        }*/
        double res = 0;
        for (Employee e : employees) {
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
      /*  double res = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){
                SalesManager salesManager = (SalesManager) employees[i]; // провели кастинг
                res += salesManager.getSalesValue();
            }
        }
        return res;*/
        double res = 0;
        for (Employee e : employees) {
            if (e instanceof SalesManager) {
                //   SalesManager salesManager = (SalesManager) e;
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    // O(n)
    @Override
    public void printEmployee() {
        for (Employee e : employees) {
            System.out.println(e);
        }

    }

    @Override
    public void printEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }


    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {

       /* // считаем сколько будет элементов массива, удовлетворяющих условию
        for (int i = 0; i < size; i++) {
            if(employees[i].getHours() > hours){
                count++;
            }
        }
        Employee[] res = new Employee[count]; // создаем массив размером count
        // заполняем массив res
        for (int i = 0, j = 0; j < res.length; i++) {
            if(employees[i].getHours() > hours){
                res[j++] = employees[i];
            }
        }
        return res; // это возвращаемый массив*/
        int count = 0;
        for (Employee e : employees) {
            if (e.getHours() > hours) {
                count++;
            }
        }
        Employee[] res = new Employee[count]; // создаем массив размером count
        count = 0;
        for (Employee e : employees) {
            if (e.getHours() > hours) {
                res[count] = employees.get(count);
               count++;
            }
        }
        return res;
    }


    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count = 0;
        for (Employee e : employees) {
            if (e.calcSalary()> minSalary && e.calcSalary() < maxSalary) {
                count++;
            }
        }

        Employee[] res = new Employee[count]; // создаем новый массив
        count= 0;
        int mount = 0;
        for (Employee e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                res[count] = employees.get(mount);
                count++;
            } mount++;
        }

        return res;
    }
}

