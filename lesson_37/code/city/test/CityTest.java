package city.test;

import city.model.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CityTest {
    City[] cities;
    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_070_000);
        cities[3] = new City("Anlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    private void  prinArray(Object[] arr, String title){
        System.out.println("=======" + title + "===========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    @Test
    void  testIntegerDesc(){
        Integer[] actual = {-1, Integer.MAX_VALUE, Integer.MAX_VALUE};
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MAX_VALUE};
        Arrays.sort(actual,(n1,n2) -> -Integer.compare(n1,n2));
        //assertArray(expected,actual);
    }


    @Test
    void  testCityComparable(){
        prinArray(cities,"Original array");
        Arrays.sort(cities);
        prinArray(cities,"Natural array");
        City pattern =  new City(null, 850_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println("Index " + index);
    }
    @Test
    void  testCityNameComporator(){
        Comparator<City> comparator = (c1, c2)  -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comparator);
        prinArray(cities,"Sort by name");

    }
    @Test
    void testArrayCopy(){
        Comparator<City> comparator = (c1, c2)  -> c1.getName().compareTo(c2.getName());
        City[] citiesCopy = Arrays.copyOf(cities, cities.length *2);
        prinArray(citiesCopy, "citiesCopy before sort");
        Arrays.sort(citiesCopy, 0,citiesCopy.length,comparator);
        prinArray(citiesCopy, "citiesCopy after sort");
        City pattern  =new City("Yalta", 0);
        int index = Arrays.binarySearch(citiesCopy,0, cities.length,pattern, comparator);
        System.out.println("index = " + index);

    }

    @Test
    void  testCopyOfRange(){
        City[] citiesCopy = Arrays.copyOfRange(cities, 0, cities.length-1);
        prinArray(citiesCopy,"copy of range");
    }
    @Test
    void  testSystemArrayCopy(){
        City[] citiesCopy = new City[cities.length - 1];
        System.arraycopy(cities, 1,citiesCopy,1,4);
        //               откуда   с какого куда в какой сколько
        prinArray(citiesCopy,"System.arrayCopy");

        // System.arraycopy самый лучший метод копировать массив
    }
    @Test
    void  testKeepSroted(){
        Arrays.sort(cities);
        prinArray(cities,"Natural city");
        City city = new City("Salem", 690_000);
        City[] citiesCopy = Arrays.copyOf(cities, cities.length+1);
        citiesCopy[citiesCopy.length -1] =city;
 //       Arrays.sort(citiesCopy);
 //      cities = citiesCopy;
        
        prinArray(cities,"Natural order after add city");
        // найти индекс где он должен стоять
        int index = Arrays.binarySearch(citiesCopy,0, citiesCopy.length-1,city);
        index= index>=0 ? index: - index -1;
        // сдвиг
        System.arraycopy(citiesCopy,index,citiesCopy,index+1,citiesCopy.length-index-1);
        // ВСТАВИТЬ
        cities = citiesCopy;
        prinArray(cities, "New massiv");
    }


}