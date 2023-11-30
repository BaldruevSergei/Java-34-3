package practice.hashset;

import practice.citizens_v2.model.Person;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class IHashSetAppl {
    public static void main(String[] args) {

        ISet<String> mySet = new IHashSet<>();
        System.out.println(mySet.size());
        mySet.add("Nerlin");
        mySet.add("Leipzig");
        mySet.add("Hamburg");
        mySet.add("Munich");
        System.out.println(mySet.size());
        mySet.add("Leipzig");
        System.out.println(mySet.size());
        System.out.println("======== Iterator ============= ");
        for (String s : mySet) {
            System.out.println(s);

        }
        ISet<Integer> numberSet = new IHashSet<>(); // целые числа в возрастающем порядке

        for (int i = 0; i <= 10; i++) {
            numberSet.add(i);
        }
        System.out.println("======== Numbers ============= ");
        for (Integer n : numberSet) {
            System.out.print(n + "| "); // вывод в возрастающем порядке

        }
        System.out.println();
        ISet<Integer> number1Set = new IHashSet<>(); //целые числа в убывающем порядке

        for (int i = 10; i >= 0; i--) {
            number1Set.add(i);
        }

        System.out.println("======== Numbers ============= ");
        for (Integer n : number1Set) {
            System.out.print(n + "| "); // вывод в возрастающем порядке

        }

        ISet<Integer> randomSet = new IHashSet<>(); //случайные целые числа
        Random random = new Random();
        System.out.println();
        System.out.println("======== Numbers random ============= ");
        for (int i = 0; i < 10; i++) {
            randomSet.add(random.nextInt(91) + 10);
        }
        for (Integer n : randomSet) {
            System.out.print(n + "| "); // вывод согласно HashCod


        }

        Set<Object> objects1Set = new HashSet(); // разные объекты
        LocalDate now = LocalDate.now();
        objects1Set.add("Two");
        objects1Set.add(100);
        objects1Set.add(new Person(4, "Bruce", "Willis", now.minusYears(25)));
        objects1Set.add(new Person(2, "John", "Smith", now.minusYears(20)));
        System.out.println();
        System.out.println("==========================  All objects ===========================");
        for (Object d : objects1Set) {  // вывод объектов типа Person по id(строенный компаратор по умолчанию
            // - сотрировка по id) остальные согласно HashCod
            System.out.println(d);

            /*Производительность HashSet:
            Плюсы:
                    Быстрые операции добавления, удаления и поиска: Операции в HashSet выполняются в среднем за постоянное время (O(1)),
                    благодаря использованию хэш-таблицы.
                    Эффективное управление размером: Автоматическое увеличение размера позволяет эффективно управлять динамическим изменением объема данных.
                    Исключение дубликатов: Автоматическое удаление дубликатов обеспечивает уникальность элементов.
            Минусы:
                    Неупорядоченность элементов: Порядок элементов не гарантирован. Для упорядоченности следует использовать LinkedHashSet или TreeSet.
                    Чувствительность к хэш-коллизиям: В случае коллизий может произойти небольшое снижение производительности.
                    Дополнительное место для хранения хэш-кодов: Хранение хэш-кодов может потребовать дополнительное место в памяти.
                    Отсутствие сортировки: Не поддерживает сортировку элементов. Для упорядоченных структур следует использовать LinkedHashSet или TreeSet.

                    В целом, HashSet представляет собой эффективную структуру данных для множества, обладающую хорошей производительностью в основных операциях, особенно при отсутствии требований к упорядочиванию элементов.

        }


        }*/


        }
    }
}