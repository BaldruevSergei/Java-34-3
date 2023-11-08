package practice.mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    // конструктор
    private StringBuilder str;
    private  int size;
    private int  currPosition;
    public MyStringIterator(StringBuilder str) {
        this.str = str;
        this.size = str.length();
        // this.currPosition = 0;
    }

    // проверка, есть ли следующий элемент
    @Override
    public boolean hasNext() {
        return currPosition < size; // это логическое выражение, true _ значит еще есть элементы множества
    }
    // 'этот метод должен вернуть элементы множества
    @Override
    public Character next() {
        Character curCharaster = str.charAt(currPosition);
        currPosition ++;
        return  curCharaster;
    }
    // метод для удаления элемента сроки
    public void remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }



}
