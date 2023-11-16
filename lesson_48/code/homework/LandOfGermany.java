package homework;

import java.util.Comparator;
import java.util.LinkedList;

//Задача 1. В классе GermanyAppl (main) cоздать LinkedList, содержащий города -
// столицы земель Германии. Опробовать на нем методы, которые доступны для класса
// LinkedList. Добавить Гамбург в середину списка, в начало списка.
public class LandOfGermany {
    public static void main(String[] args) {
        // great LinkedList for cites
        LinkedList<String> landOfGermany = new LinkedList<>();

        // add cites
        landOfGermany.add("Bremen");
        landOfGermany.add("Berlin");
        landOfGermany.add("Dresden");
        landOfGermany.add("Dusseldorf");
        landOfGermany.add("Hanover");
        landOfGermany.add("Erfurt");
        landOfGermany.add("Potsdam");
        landOfGermany.add("Mainz");
        landOfGermany.add("Saarbrucken");
        landOfGermany.add("Schwerin");
        landOfGermany.add("Magdeburg");
        landOfGermany.add("Munich");
        landOfGermany.add("Stuttgart");
        landOfGermany.add("Wiesbaden");


        // выводим список на печать

        System.out.println("Lands  Of Germany : " + landOfGermany);


        // add Kiel in list
        landOfGermany.add(7,"Kiel");
        System.out.println("==========================================");
        System.out.println("Lands  Of Germany : " + landOfGermany);

        // add Hamburg in first list

        landOfGermany.addFirst("Hamburg");
        System.out.println("==========================================");
        System.out.println("Lands  Of Germany : " + landOfGermany);


        System.out.println("==========================================");
        System.out.println("Quantity Lands  Of Germany : " + landOfGermany.size());

        // sort by name
        landOfGermany.sort(Comparator.naturalOrder());
        System.out.println("==========================================");
        System.out.println("Lands  Of Germany sort : " + landOfGermany);


        // remove first in  list
        landOfGermany.removeFirst();
        System.out.println("==========================================");
        System.out.println("Lands  Of Germany  : " + landOfGermany);

        landOfGermany.removeFirst();
        System.out.println("==========================================");
        System.out.println("Quantity Lands  Of Germany : " + landOfGermany);

        // remove all
        landOfGermany.removeAll(landOfGermany);
        System.out.println("==========================================");
        System.out.println("Quantity Lands  Of Germany : " + landOfGermany);


    }
}
