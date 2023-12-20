package practice.company_stream1.dao;

import practice.company_stream1.model.Employee;
import practice.company_stream1.model.Employee1;
import practice.company_stream1.model.SalesManager1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CompanyHashSetImpl1 implements Company1 {
    private Set<Employee1> employees;// instead of a List Set
    private int capacity;

    public CompanyHashSetImpl1(int capacity){
        this.capacity=capacity;
        employees=new HashSet<>();
    }
    // 0(1)
    @Override
    public boolean addEmployee(Employee1 employee) {
        if (employee == null || employees.size() == capacity) {
            return false;
        }
        return employees.add(employee);//операция добавления и удаления из множества имеет сложность O(1)
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    // O(1) в худшем случае O(n)
    @Override
    public Employee1 removeEmployee(int id) {
        Employee1 victim=findEmployee(id);
        employees.remove(victim);
        return victim;//множества не содержат null
    }
    // O(1) в худшем случае O(n)
    @Override
    public Employee1 findEmployee(int id) {
        for (Employee1 e:employees) {
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }
    // O(1)
    @Override
    public int quantity() {
        return employees.size();
    }

    @Override
    public double totalSalary() {
        double res=0;
        for (Employee1 e:employees) {
            res+=e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary()/employees.size();
    }

    @Override
    public double totalSales() {
        double res=0;
        for (Employee1 e:employees ) {
            if(e instanceof SalesManager1){
                res+=((SalesManager1) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        employees.forEach(s-> System.out.println(s));
    }

    @Override
    public Employee1[] findEmployeesHoursGreaterThan(int hours) {

        return findEmployeesByPredicate(e->e.getHours()>=hours);
    }

    private Employee1[] findEmployeesByPredicate(Predicate<Employee1> predicate) {
        List<Employee1> res = new ArrayList<>();
        for (Employee1 employee : employees ) {
            if (predicate.test(employee)) {
                res.add(employee);
            }
        }
        return res.toArray(new Employee1[0]); // Новинка !!!

    }

    @Override
    public Employee1[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate(e-> e.calcSalary() >= minSalary && e.calcSalary() < maxSalary);
    }

}


