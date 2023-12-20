package practice;

import java.util.*;

public class RiverAppl {
    public static void main(String[] args) {
        // rivers in massiv

        River[] river = new River[7];

        river[0] = new River("Lech", 3000,"Europe");
        river[1] = new River("Thames", 3460,"Europe");
        river[2] = new River("Isar", 2900,"Europe");
        river[3] = new River("Main", 2600,"Europe");
        river[4] = new River("Nile", 6650,"Africa");
        river[5] = new River("Mississippi", 3770,"North America");
        river[6] = new River("Amazon", 7062,"South America");

        // найти общую длину, max и т.д.
        // отсортировать
        // удалить
        int sum = Arrays.stream(river)
                .filter(Objects::nonNull)
                .mapToInt(River::getLength)
                .sum();
        System.out.println("Sum of lengths: " + sum);

        OptionalInt max = Arrays.stream(river)
                .filter(Objects::nonNull)
                .mapToInt(River::getLength)
                .max();
        System.out.println("Max length river : " + max.getAsInt());

        // sorting native
        Arrays.sort(river);
        for (int i = 0; i < river.length; i++) {
            System.out.println(river[i]);
        }
        System.out.println("--------------------------------- ");

        // sort by lengths
        Comparator<River> lengthComparator = Comparator.comparing(River::getLength);
        Arrays.sort(river,lengthComparator);
        for ( River r: river) {
            System.out.println(r);

        }
        System.out.println("--------------------------------- ");
        // River in List
        List<River> riverList = new ArrayList<>(List.of(
                new River("Ob", 6500, "Asia"),
                new River("Amazon", 6575, "South America"),
                new River("Dnieper", 2201, "Europe")
        )

        );

        riverList.forEach(System.out::println);

        // объедением массив и лист
        Collections.addAll(riverList, river);
        System.out.println("--------------------------------- ");
        System.out.println(riverList.size());
        riverList.forEach(System.out::println);
        System.out.println("--------------------------------- ");
        // sort by alphabet
        Collections.sort(riverList);
        riverList.stream()
                .forEach(System.out::println);

        System.out.println("-------------------------------------- ");
        Collections.addAll(riverList,river);
        riverList.stream()
                .forEach(System.out::println);


        // данные задвоились River in Set

        System.out.println("River in Set");
        Set<River> riverSet = new HashSet<>();
        // переложим данные из списка во множество
        System.out.println("-------------------------------------- ");
        for (River r: riverList) {
            riverSet.add(r);

        }
        riverSet.forEach(System.out::println);

        System.out.println(riverSet.size());

        // перекладываем в ThreeSet
        System.out.println("-------------------------------------- ");
        Set<River> riverTrheeSet = new TreeSet<>(riverSet);
      /*  for (River r:riverSet  ) {
            riverTrheeSet.add(r);

        }*/
        riverTrheeSet.forEach(System.out::println);

        // Map ключ континенты  , значение - сколько на нем рек
         River[] rivers = new River[11];
        rivers[0] = new River("Thames", 2500, "Europe");
        rivers[1] = new River("Nile", 6650, "Africa");
        rivers[2] = new River("Mississippi", 3770, "North America");
        rivers[3] = new River("Amazon", 6575, "South America");
        rivers[4] = new River("Murray", 2520, "Australia");
        rivers[5] = new River("Ice River", 1800, "Antarctica");
        rivers[6] = new River("Yangtze", 6380, "Asia");
        rivers[7] = new River("Seine", 776, "Europe");
        rivers[8] = new River("Congo", 4700, "Africa");
        rivers[9] = new River("Yenisei", 5542, "North America");
        rivers[10] = new River("Orinoco", 2140, "South America");

        System.out.println("===========================" );
        Collections.addAll(riverTrheeSet, rivers);
        riverTrheeSet.forEach(System.out::println);
        System.out.println(riverTrheeSet.size());
        System.out.println("===========================" );
        // сделать мап  Map ключ континенты  , значение - сколько на нем рек
        Map<String, Integer> riverMap = new TreeMap<>();
        for (River r: riverTrheeSet) {
            String continent = r.getContinent(); // ключ
            riverMap.put(continent, riverMap.getOrDefault(continent, 0) + 1);

        }
        // печатаем содержимое мапы
        for (Map.Entry<String, Integer> entry: riverMap.entrySet()) {
            System.out.println(" Continent " + entry.getKey() + "  Number of rivers " + entry.getValue());
        }


        }






    }

