
package practice.company_stream1.dao;

import practice.company_stream1.model.Employee;
import practice.company_stream1.model.Employee1;

import java.util.TreeSet;

public class CompanySetImpl1 implements Company1 {
    private TreeSet<Employee1> employees;// instead of a Set
    private int capacity;
    public CompanySetImpl1(int capacity){
        this.capacity=capacity;
        employees=new TreeSet<>();
    }



    @Override
    public boolean addEmployee(Employee1 employee) {
         return employee != null && employees.add(employee);//операция добавления  имеет сложность O(1)
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee1 removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee1 findEmployee(int id) {
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
    public Employee1[] findEmployeesHoursGreaterThan(int hours) {
        return new Employee1[0];
    }

    @Override
    public Employee1[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return new Employee1[0];
    }
}

