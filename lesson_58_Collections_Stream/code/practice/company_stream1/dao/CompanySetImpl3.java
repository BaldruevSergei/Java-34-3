
package practice.company_stream1.dao;

import practice.company_stream1.model.Employee;

import java.util.TreeSet;

public class CompanySetImpl3 implements Company3 {
    private TreeSet<Employee> employees;// instead of a Set
    private int capacity;
    public CompanySetImpl3(int capacity){
        this.capacity=capacity;
        employees=new TreeSet<>();
    }



    @Override
    public boolean addEmployee(Employee employee) {
         return employee != null && employees.add(employee);//операция добавления  имеет сложность O(1)
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double avgSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployees() {

    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return new Employee[0];
    }
}

