package practice.Json_wrapper;
// Леонид, возраст  59 лет - это данные в одной программе
// {name: Leonid age: 59 - это }
public class JsonWrapper1 {
    // поле класса
    private Object value;

    // конструктор
    public JsonWrapper1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value + "}";
    }
}

