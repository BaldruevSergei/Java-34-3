package homework.todolist;


import homework.todolist.dao.ToDoListImpl;
import homework.todolist.model.Menu;
import homework.todolist.model.Task;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl toDoList = new ToDoListImpl();

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    LocalDate now = LocalDate.now();
                    Task newTask = new Task(task, now);
                    toDoList.addTask(newTask);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(taskNumber);
                    if(!(removedTask == null)){
                        System.out.println(removedTask + " is removed.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Saving... ");
                    List<Task> tasks = toDoList.getAllTasks();
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./lesson_64_Many_Stream/code/homework/todolist.dat"))) {
                        oos.writeObject(tasks);
                        System.out.println("ArrayList записан в файл");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 5:{
                    System.out.println("Loading... ");
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./lesson_64_Many_Stream/code/homework/todolist.dat"))) {
                        List<Task> readTasks = (List<Task>) ois.readObject();
                        System.out.println("Прочитанный список: " + readTasks);
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 6:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}