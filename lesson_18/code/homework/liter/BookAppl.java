package homework.liter;

import homework.liter.type.Book;
import homework.liter.type.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
        Book d1 = new Dictionary("ccc", "Trbhd ", 1975, 32233322, "jjnkj", "sswwdd", "www", "Poligraphi");
        Book d2 = new Dictionary("Tne Mars ", "Dido", 1965, 484248949, "Scince", "Scince", "+ 18", "Poligraphi");
        Book d3 = new Dictionary("Mowgli", "Kipling", 1965, 112949, "Fairy", "Artistical", "+ 0", "Poligraphi");

        System.out.println();
        d1.display();
        System.out.println("---------------------------------------------------");
        d2.display();
        System.out.println("---------------------------------------------------");
        d3.display();

    }
}


