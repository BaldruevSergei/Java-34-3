package homework.students;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DekanatAppl {
    public static void main(String[] args) {
        //  В приложении DekanatAppl создать студентов из разных стран, которые
        // учатся на разных курсах, в разных группах. Сделать списки студентов по курсам, по группам, отсортированные по фамилиям
        // и возрасту. Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу? По всем студентам?
        // Дополнительное задание (**): добавить у каждого студента поле int[] marks с его оценками и рассчитать средний балл.
        LocalDate now = LocalDate.now();
        // создаем массив из студентов
        Student[] students = new Student[8];
        students[0] = new Student(2, "Qike", "Jordan", 25, "IT", 105, "USA", "M");
        students[1] = new Student(3, "John", "Smith",20, "Cinema", 105, "Canada", "M");
        students[2] = new Student(5, "Nataly", "Portman", 19, "Culture", 102, "France", "F");
        students[3] = new Student(7, "Annalena", "Baerbock", 20, "Politic", 101, "Germany", "F");
        students[4] = new Student(10, "Mike", "Morgan", 22, "IT", 102, "USA", "M");
        students[5] = new Student(22, "John", "Ymith", 17, "Cinema", 101, "Canada", "M");
        students[6] = new Student(40, "Natalys", "Trueman", 19, "Politic", 105, "Grace", "F");
        students[7] = new Student(1, "Anna", "German", 23, "IT", 101, "Italy", "F");

        // вносим студентов в список
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            studentList.add(students[i]);
        }
        printUsers(studentList);
        // студенты группируются по курсам в MAP
        Map<String, List<Student>> stringListMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCourse));  // собираем в коллекцию по условию (курсы)

        stringListMap.forEach((course, students1) -> { // В результате выполнения этой операции получается Map,
            // где ключами являются уникальные значения курсов, а значениями — списки студентов, отнесенных к каждому курсу.
            System.out.println("Course: " + course);
            students1.stream()
                            .sorted(Comparator.comparing(Student::getLastName) // сортируем  по фамилии
                                    .thenComparing(Student::getBirthDay)) // затем по возрасту
                            .forEach(student -> System.out.println("    " + student));
        });


        // подсчет  кол-ка мужчин
        long maleCount = studentList.stream()
                .filter(student -> "M".equals(student.getGender()))
                .count();
        // подсчет  кол-ка женщин
        long femaleCount = studentList.stream()
                .filter(student -> "F".equals(student.getGender()))
                .count();
        System.out.println("Number of Male Students: " + maleCount);
        System.out.println("Number of Female Students: " + femaleCount);

        Map<String, List<Student>> stringListMap1 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender));  // собираем в коллекцию по условию (пол)
        stringListMap1.forEach((gender,students2)->{
            System.out.println("Genger " + gender);
            double averageAge1 = students2.stream()
                    .collect(Collectors.averagingDouble(Student::getBirthDay));

            System.out.println("Average  Students: " + gender + " =  " +  averageAge1);

        });


        double average2 = studentList.stream()
                .collect(Collectors.averagingDouble(Student::getBirthDay));
        System.out.println("Average all student " + average2);




    }




    public static void printUsers(List<Student> studentList) {
        // Перебор всех элементов userList с помощью forEach() и вывод их в консоль
        System.out.println("----------------------------------------");
        studentList.stream()
                .forEach(System.out::println);
        System.out.println("------------------------------------------");
    }

}
