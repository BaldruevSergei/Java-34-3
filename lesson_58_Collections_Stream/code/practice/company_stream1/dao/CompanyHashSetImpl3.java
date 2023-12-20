package practice.company_stream1.dao;

import practice.company_stream1.model.Employee;
import practice.company_stream1.model.SalesManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CompanyHashSetImpl3 implements Company3 {
    private Set<Employee> employees;// instead of a List Set
    private int capacity;

    public CompanyHashSetImpl3(int capacity){
        this.capacity=capacity;
        employees=new HashSet<>();
    }
    // 0(1)
    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || employees.size() == capacity) {
            return false;
        }
        return employees.add(employee);//операция добавления и удаления из множества имеет сложность O(1)
    }
    // O(1) в худшем случае O(n)
    @Override
    public Employee removeEmployee(int id) {
        Employee victim=findEmployee(id);
        employees.remove(victim);
        return victim;//множества не содержат null
    }
    // O(1) в худшем случае O(n)
    @Override
    public Employee findEmployee(int id) {
        for (Employee e:employees) {
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
        for (Employee e:employees) {
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
        for (Employee e:employees ) {
            if(e instanceof SalesManager){
                res+=((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        employees.forEach(s-> System.out.println(s));
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {

        return findEmployeesByPredicate(e->e.getHours()>=hours);
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {
        List<Employee> res = new ArrayList<>();
        for (Employee  employee : employees ) {
            if (predicate.test(employee)) {
                res.add(employee);
            }
        }
        return res.toArray(new Employee[0]); // Новинка !!!

    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate(e-> e.calcSalary() >= minSalary && e.calcSalary() < maxSalary);
    }

}


