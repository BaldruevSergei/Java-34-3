package homework.yachts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Нужно создать набор яхт и выполнить следующие задачи:

public class YahtAppl {
    public static void main(String[] args) {;
        List<Yaht> yahtList = new ArrayList<>();
       // YahtAppl yaht = new YahtAppl();
        Yaht[] yahts = new Yaht[5];
         yahts[0] =  new Yaht(1,"Oslo", 2000,20, "Plastic", 600_000);
         yahts[1] = new Yaht(10,"Shanghai", 2022,10, "Wood", 1_600_000);
         yahts[2] = new Yaht(20,"Busan", 2010,30, "Gold", 30_600_000);
         yahts[3] = new Yaht(12,"Rotterdam", 2006,32, "Plastic", 900_000);
         yahts[4] = new Yaht(3,"Long Beach", 1999,16, "Wood", 60_000);

        for (int i = 0; i < yahts.length; i++) {
            yahtList.add(yahts[i]);
        }

        // print
        //отобразить все яхты;
        for (Yaht d: yahtList) {
            System.out.println(d);
        }
        //отобразить яхты, сделанные из указанного материала корпуса;
        System.out.println();
        yahtList.stream()
                .filter(yaht -> yaht.getMaterial().equals("Wood"))
                        .forEach(yaht -> System.out.println("Yaht form Wood" + yaht));
        //отобразить яхты дороже указанной цены;
        System.out.println();
        yahtList.stream()
                .filter(yaht -> yaht.getPrice()>1_000_000)
                .forEach(yaht -> System.out.println("Yaht with price > 1,000,000: " + yaht));

        //отобразить яхты, чей год выпуска находится в заданном диапазоне;
        int startYear = 2000;
        int endYear = 2010;
        System.out.println();
        System.out.println("Yahts manufactured between " + startYear + " and " + endYear + ":");
        yahtList.stream()
                .filter(yaht -> yaht.getYear() >= startYear && yaht.getYear() <= endYear)
                .forEach(System.out::println);

        //отсортировать яхты в порядке убывания стоимости;
        System.out.println("Sorted by price");
        yahtList.stream()
                .sorted(Comparator.comparing(Yaht::getPrice).reversed())
                .forEach(System.out::println);

        //получить среднюю стоимость яхты из созданного набора.
        System.out.println();
        double averagePrice = yahtList.stream()
                .collect(Collectors.averagingDouble(Yaht::getPrice));
        System.out.println("Average cost of yachts: " + averagePrice);








            }
}
