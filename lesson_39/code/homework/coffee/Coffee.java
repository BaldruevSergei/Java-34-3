package homework.coffee;
//Задача 1. Начать реализацию приложения "Список дел".
//
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
public enum Coffee {
    ESP("Expresso", 3.25), AMR("Americano", 3.85), CAP("Capuccino", 4.5), LAT("Latte",4.85);

    // поля
    private  String type;
    private double price;

    Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
