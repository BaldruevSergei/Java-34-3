package practice.mystring;

import practice.mystring.model.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character>{
    // fields
    private StringBuilder str; //  StringBuilder - это встроенный в Java класс

    // конструктор

    public MyString(StringBuilder str) {
        this.str = new StringBuilder(str);
    }

    public StringBuilder getStr() {
        return str;
    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }

    // метод добавления симвлов

    public void addChar(char ch){
        str.append(ch);

    }

    // метод удаления  символа

    public  void removeChar(char ch){
        int index = str.indexOf(Character.toString(ch)); // навли индекс слева направоб на котором стоит ch
        str.deleteCharAt(index); // удаляем на индексе ch
    }

    @Override
    public String toString() {
        return  str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}
