package homework.todolist;

import homework.todolist.dao.ToDoListImpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ToDoList_Input {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dest/toDoList.dat"))) {
            // deserializing from stream of bytes to object
            ToDoListImpl toDoList = (ToDoListImpl) ois.readObject(); // кастинг
            for (int i = 0; i < toDoList.quantity(); i++) {
                System.out.println(toDoList.toString());
            }; // print
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}

