package practice.company_v2.dao;

//public class CompanyImpl7 implements Company7 {
    //fields, которые описывают компанию
   // private Employee[] employees; //массив для хранения сотрудников
    //private int size; //текущее количество сотрудников

    //конструктор
   // public CompanyImpl7(int capacity) {
      //  employees = new Employee[capacity];//максимальная вместимость
  //  }@Override
//  // public boolean addEmployee(Employee7 employee) {
//    //        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null){
//    //        employees[size++]= employee;
//    //
//    //        }
//    //        return false;
//    //    }
//
//   // @Override
//    public boolean addEmployee(Employee employee) {
//        return false;
//    }
//
//
//    @Override
//    public Employee removeEmployee(int id) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getId() == id) {
//                Employee victim = employees[i]; //включили найденный элемент в переменную
//                //   employees[i] = employees[size - 1];
//                // employees[size - 1] = null;
//                //size--;
//                //можно написать короче TODO
//                employees[i] = employees[--size];//префиксная операция
//                employees[size] = null;
//                return victim;
//            }
//        }
//        return null;
//    }
//
//
//    @Override
//    public Employee findEmployee(int id) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getId() == id) {// если нашёлся элемент массива у которого совпал id
//                return employees[i];//вернули найденного работника *элемент массива* типа Employee
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public int quantity() {
//        return size;
//    }
//
//    @Override
//    public double totalSalary() {
//        double res = 0;
//        for (int i = 0; i < size; i++) {
//            res += employees[i].calcSalary();
//        }
//        return res;
//    }
//
//    @Override
//    public double avgSalary() {
//        return 0;
//    }
//
//    @Override
//    public double averageSalary() {
//        return totalSalary() / size;
//    }
//
//    @Override
//    public double totalSales() {
//        double res = 0;
//        for (int i = 0; i < size; i++) {
//            if (employees[i] instanceof SalesManager) {
//                SalesManager salesManager = (SalesManager) employees[i];//сделали кастинг *перевели его в Sales*
//                res += salesManager.getSalesValue();
//            }
//
//        }
//
//        return res;
//    }
//
//    @Override
//    public void printEmployee() {
//
//    }
//
//    @Override
//    public void printEmployees() {
//        for (int i = 0; i < size; i++) {
//            System.out.println(employees[i]);
//        }
//
//    }
//
//    //Для выборки элементов из массива, удовлетворяющих заданному условию, надо:
//    //сначала подсчитать количество элементов массива, удовлетворяющих условию.
//    //потом создать массив под это количество,
//    //и только потом его заполнить.
//
//
//    @Override
//    public Employee[] findEmployeesHoursGreaterThan(int hours) {
//        int count = 0;
//        //считаем сколько будет элементов массива, удовлетворяющих условию
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getHours() > hours) {
//                count++;
//            }
//        }
//        Employee[] res = new Employee[count]; //создаём массив размером count
//        //заполняем res
//        for (int i = 0, j = 0; j < res.length; i++) {
//            if (employees[i].getHours() > hours) {
//                res[j++] = employees[i];
//            }
//        }
//        return res;  //это возвращаемый массив
//
//    }
//
//
//    @Override
//    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
//        //считаем сколько будет элементов массива, удовлетворяющих условию
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary()<maxSalary) {
//                count++;}
//
//        }
//        Employee[] res = new Employee[count]; //создаём массив размером count
//        //заполняем res
//        for (int i = 0, j = 0; j < res.length; i++) {
//            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary()<maxSalary) {
//                res[j++] = employees[i];
//            }
//        }
//        return res; //это возвращаемый массив
//    }
//
//
//}




