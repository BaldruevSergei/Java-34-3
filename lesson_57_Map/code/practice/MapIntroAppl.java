package practice;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntroAppl {
    public static void main(String[] args) {
        Map<String, Integer> usaCities = new TreeMap<>();
        usaCities.put("Denver", 600_000);
        usaCities.put("Boston", 670_000);
        usaCities.put("Chicago", 2_700_000);
        usaCities.put("Atlanta", 470_000);
        usaCities.put("New-York",8_500_000);
        usaCities.put("Dallas", 1_300_000);
        usaCities.replace("Dallas",1_300_010); // Обновили значение
        System.out.println("Map size ="  + usaCities.size()) ;
        System.out.println("Map size ="  + usaCities.isEmpty()) ;

        Integer num = usaCities.get("Chicago");
        System.out.println(num);
        int pop = usaCities.get("Atlanta");
        System.out.println(pop);

        System.out.println(usaCities.containsKey("Boston"));
        System.out.println(usaCities.containsKey("Detroit"));

        num = usaCities.put("Chicago", 2_700_001);
        System.out.println(num); //  это старое значение переменной
        System.out.println(usaCities.get("Chicago")); // вытаскиваем ключом
        num = usaCities.put("Chicago", 2_700_002);
        System.out.println(num);

        // вместо Collection все находится выше
        Collection<Integer> population = usaCities.values(); // вытащили все значения
        int total = 0;
        /*for (Integer integer: population ) {
            total += integer;
        }
        */
        for (Integer integer : population) {
            total += integer;
        }

        System.out.println("Population: " + total);

        // распечатать содержимое мапы
        // первый способ
        System.out.println("=========== Print Map ================  ");
        Set<String> keys = usaCities.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + usaCities.get(key));
        }

        // метод 2
        System.out.println("=========== Print Map another ================  ");
        Set<Map.Entry<String,Integer>> entries = usaCities.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());

        }

        // еще другой способ
        System.out.println("=========== Print Map another ================  ");
        System.out.println(usaCities.entrySet());

    }
}
