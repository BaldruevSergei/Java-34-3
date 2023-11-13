package practice.ilist;

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


        System.out.println();
        System.out.println("================================");

        IList<String> city = new IListImpl<>(); //  список на основе типа String (города)

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


        for (String q : city) {
            System.out.print("   " + q);
        }
        System.out.println();
        System.out.println("================================");
        city.remove("Oslo");
        city.add("Bonn");

        // печать при помощи Iterator
        for (String d : city) {
            System.out.print(d + " ");
        }

        city.add("New York");
        System.out.println();
        System.out.println("================================");
             // печать при помощи Iterator
        for (String d1 : city) {
            System.out.print(d1 + " ");}
        city.add(3, "KAIR"); // вставили эелемент в индекс 3, на 4 место
        System.out.println();
        System.out.println("================================");
        for (String d2 : city) {
        System.out.print(d2 + " ");}
        city.clean(); // затираем элементы массива
        System.out.println();
        System.out.println("================================");

        for (String d3 : city) {
        System.out.println(d3 + " ");}
        }
}










