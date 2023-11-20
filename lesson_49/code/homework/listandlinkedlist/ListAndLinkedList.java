package homework.listandlinkedlist;
//Задача 3.(*) Напишите метод, который получает на вход List, а возвращает L
// inkedList, который содержит все строки
// исходного List’а, но в обратном порядке. Например: {“Джэк”,“Джон”,“Ник”} -->
// {“Ник”,“Джон”,“Джэк”}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAndLinkedList {
    public static void main(String[] args) {


    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
        for (String d: list) {
            System.out.print (d + " ");
        }


    ListAndLinkedList listAndLinkedList = new ListAndLinkedList();
        String reversLinkedList = listAndLinkedList.reversLinkedList(list);
        System.out.println("\n Reversed List " + reversLinkedList);
    }
    public String reversLinkedList(List<String> newList){

       LinkedList<String> lists = new LinkedList<>(newList);


return lists.toString();
        }


        }


