package practice.company_v2.dao;

import practice.company_v2.model.Employee;
import practice.company_v2.model.SalesManager;


public class CompanyImpl implements Company {
    // поля которые описывают компанию
    private Employee[] employees; // массив для хранения сотрудников компании
    private  int size;// текущее кол-во сотрудников в компании


   public CompanyImpl(int capacity){

       employees = new Employee[capacity]; // capacity - максимальный размер компании
   }

    @Override
    public boolean addEmployee(Employee employee) {
       // не добавляем null, не привышаем capacity, не добаляем уже существующего
       if (employee == null || size == employees.length || findEmployee(employee.getId()) != null){
           return false;
       }
       employees[size] = employee; // новый элемент
       size++;
       return true;


    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                Employee victim = employees[i];
                employees[i] = employees[size-1];// на место найденного поставили последнего существующего в массиве
                employees[size-1]=null;// обнулили последнего
                size--;
                // можно написать короче этот код TODO
                return victim;
            }

        }

       return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){ // проверка нашелся  элемент массива у которого совпал id
                return employees[i]; // вернули найденный элемент массива типа Employee
            }
        }
       return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
       double res = 0;
        for (int i = 0; i < size; i++) {
            res+= employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
       return totalSalary()/ size;
    }

    @Override
    public double totalSales() {
       double res = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){
                SalesManager salesManager=(SalesManager) employees[i]; // кастинг
            res+= salesManager.getSalesValue();

        }
        return res;
    }

    @Override
    public void printEmployee() {

    }
}
