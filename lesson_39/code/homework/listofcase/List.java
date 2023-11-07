package homework.listofcase;
//Задача 1. Начать реализацию приложения "Список дел".
//
//Использовать enum для организации меню (номер пункта, действие) приложения:
//добавить запись
//посмотреть все записи
//удалить запись (по номеру)
//выйти
//Реализовать метод printMenu().
//
//Реализовать класс Task (int id, String task, int taskNumber). Геттеры и сеттеры, toString, equals.
// Сделать класс Task сортируемым по номеру задачи.
//
//Интерфейс ToDoList должен соответствовать функциям меню.
//
//ToDoListImpl - создать, реализовать методы.
//
//ToDoAppl - приветствие пользователю, печать меню, запрос выбора пользователя (бесконечный цикл + switch case).
public enum List {
    ADD(1,"Add recording"), REA(2,"Read"), DEL(3, "Delete"),EXI(4,"Exit");

    private int id;
    private  String task;
    private void printMenu(){
        List[] list = List.values();
        System.out.println(list.length);
    }

    List(int id, String task) {
        this.id = id;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "ListTOffCase{" +
                "id=" + id +
                ", task='" + task + '\'' +
                '}';
    }

}
