package practice.ilist;

import java.util.Iterator;

public class IListAppl {
    public static void main(String[] args) {

        // список с целыми цислами
        IList<Integer> list = new IListImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("---------------------");
        System.out.println(list.indexOf(30));

        System.out.println("---------------------");

        IList<String> listOfCities = new IListImpl<>();
        System.out.println(listOfCities.size());
        System.out.println(listOfCities.isEmpty());
        System.out.println("================================");
        System.out.println(list.lastIndexOf(10));

        Iterator<Integer> iterator = list.iterator(); // печать при помощи Iterator
        while (iterator.hasNext()) {
            System.out.print("   " + iterator.next());
        }
        System.out.println();
        System.out.println("================================");
        IList<String> city = new IListImpl<>();

        city.add("Berlin");
        city.add("Budapest");
        city.add("Vienna");
        city.add("Brussels");
        city.add("Sofia");
        city.add("London");
        city.add("Amsterdam");
        city.add("Copenhagen");
        city.add("Dublin");
        city.add("Madrid");
        city.add("Rome");
        city.add("Oslo");
        city.add("Helsinki");
        city.add("Paris");
        System.out.println("Our Array(String)  has " + city.size() + "  elements");
        System.out.println(city.isEmpty());

        Iterator<String> iterator1 = city.iterator(); // печать при помощи Iterator
        while (iterator1.hasNext()) {
            System.out.print("   " + iterator1.next());
        }
    }



    }





