package practice.tourists;
//Задание 2. Турагентство специализируется на странах Средиземноморья - Испания, Франция, Италия, Греция, Турция, Тунис.
// Имеется таблица с данными о поездках клиентов в течение 2020-2023 годов в перечисленные страны. Каждый из клиентов
// посетил от одной до 3 стран, причем некоторые страны по 2 и более раз. Необходимо ответить на вопросы:
//1. Какие страны наиболее популярны?
//2. Кто из клиентов посетил наибольшее количество стран?

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TouristAppl {
    public static void main(String[] args) {
        // кто  больше стран посетил
        List<Tourist> tourists = getTourists(); // заполняем список туристов
        tourists.forEach(System.out::println);
        System.out.println("===========Most skilled tourists==========");
        printMostSkilledTourists(tourists);
        // какие страны популярны
        System.out.println("===========Most popular countries==========");
        printMostPopularCountries(tourists);


    }   // end of main

    // кто  больше стран посетил

    private static void printMostSkilledTourists(List<Tourist> tourists) {
        // сколько раз встретилась страна , список стран
        Map<Integer, List<Tourist>> skilledTourists = tourists.stream()
                .collect(Collectors.groupingBy(p -> p.getCountries().length));
        Integer max = skilledTourists.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        // Получаем список самых опытных туристов
        List<Tourist> mostSkilledTourists = skilledTourists.get(max);

        // Выводим информацию о самых опытных туристах, включая их имена
        System.out.println("Most Skilled Tourists:");
        for (Tourist tourist : mostSkilledTourists) {
            System.out.println("Name: " + tourist.getName() + ", Countries Visited: " + max);
        }
    }

    // какие страны популярны
    private static void printMostPopularCountries(List<Tourist> tourists) {
        // сколько раз встретилась страна, список стран
        Map<String, Long> sortedCountryCount = tourists.stream()
                // поток туристов в поток стран.
                .flatMap(tourist -> Arrays.stream(tourist.getCountries()))
                .collect(Collectors.groupingBy(country -> country, Collectors.counting()));

        sortedCountryCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())  // сортировка в обратном порядке
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));



    }

    private static List<Tourist> getTourists() {
        return List.of(
                new Tourist("Name", "C1", "C2", "C3"),
                new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new Tourist("Bilbo Baggins","Italy","Spain", "Turkey"),
                new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                new Tourist("Sergei_B","Tunis", "Turkey", "China", "Vietnam"),
                new Tourist("Galina","Italy","France","Italy"),
                new Tourist("Anatoly","Montenegro","Albania","Greece","Italy"),
                new Tourist("Andrii", "UK","Ireland","Spain"),
                new Tourist("Liubov", "Croatien", "Slovenien", "Spain", "France", "Egypt"),
                new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }










} // end of class
