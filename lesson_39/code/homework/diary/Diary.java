package homework.diary;
//Использовать enum для организации меню (номер пункта, действие) приложения:
//добавить запись
//посмотреть все записи
//удалить запись (по номеру)
//выйти
//Реализовать метод printMenu().
//
//Реализовать класс Task (int id, String task, int taskNumber). Геттеры и сеттеры, toString, equals. Сделать класс Task сортируемым по номеру задачи.
//
//Интерфейс ToDoList должен соответствовать функциям меню.
//
//ToDoListImpl - создать, реализовать методы.
//
//ToDoAppl - приветствие пользователю, печать меню, запрос выбора пользователя (бесконечный цикл + switch case).
public enum Diary {
    ADD(1,"Add recording"), LOO(2, "Look recording"), DEL(3, "Delete recording"), EXI(4,"Exit");
    private int number;
    private String action;

    Diary(int number, String action) {
        this.number = number;
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    private void printMenu(){
        Diary[] diary = Diary.values();
        System.out.println(diary.length);
    }
}
