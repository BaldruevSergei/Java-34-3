package homework.listandlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String d : list) {
            System.out.print(d + " ");
        }

        Example example = new Example();
        String reversedListString = example.reverseLinkedList(list);
        System.out.println("\nReversed List: " + reversedListString);
    }

    public String reverseLinkedList(List<String> inputList) {
        LinkedList<String> linkedList = new LinkedList<>(inputList);

        // Обращаем порядок элементов в связанном списке
        for (int i = 0, j = linkedList.size() - 1; i < j; i++, j--) {
            String temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(j));
            linkedList.set(j, temp);
        }

        // Возвращаем обращенный список в виде строки
        return linkedList.toString();
    }
}
