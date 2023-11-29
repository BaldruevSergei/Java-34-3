package practice.citizens_v2.dao;

import practice.citizens_v2.model.Person;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class CitizensHashSetImpl implements  Citizens{
    private Set<Person> idList; // список граждан по id
    private Set<Person> lastNameList; // список граждан по фамилиям
    private Set<Person> ageList; // список граждан по возрасту

    // constructor
    // пустой конструктор
    public CitizensHashSetImpl() {
        idList = new HashSet<>(); // создаем пустой лист
        lastNameList = new HashSet<>();
        ageList = new HashSet<>();
    }

    public CitizensHashSetImpl(List<Person> citizens) {
        this(); // вызов пустого конструктора
        citizens.forEach(this::add);
    }

    // O(1)
    @Override
    public boolean add(Person person) {
        // возвращаем TRUE если  не null и  смогли его добавить по трем Листам (спискам)
        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }

    // O(1)
    @Override
    public boolean remove(int id) {
        Person person = find(id); // находим объект типа Person по id

        // возвращаем TRUE если  не null и  смогли его удалить по трем Листам (спискам)
        return person != null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
    }

    // O(1)
    @Override
    public Person find(int id) {
        // фильруем поток Объектов по id, если нашли  первый - то возвращаем его, если нет то возвращаем null
        return idList.stream().filter(person -> person.getId() == id).findFirst().orElse(null);
    }

    // O(n)
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        return ageList.stream() // преобразует множество ageList в объекты(поток) типа Person.
                .filter(person -> person.getAge() >= minAge && person.getAge() <= maxAge) // фильтруем поток по условию  возраст больше или равен minAge и меньше или равен maxAge
                .toList(); // собираем отфильрованный поток в список объектов типа Person.
    }

    // O(n)
    @Override
    public Iterable<Person> find(String lastName) {
        return lastNameList.stream()// преобразует множество ageList в объекты(поток) типа Person.
                .filter(person -> person.getLastName().equals(lastName))// фильтруем поток по условию -  Если поступившая Фамилия  совпала с фамилией person
                .toList();// собираем отфильрованный поток в список объектов типа Person.
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return idList.stream()// преобразует множество ageList в объекты(поток) типа Person.
                .sorted(Comparator.comparingInt(Person::getId)) // сортируем на основе строенного компаратора Comparator.comparingInt(естественная сортировка)
                .collect(Collectors.toList()); // Собирает отсортированный поток объектов в список.
    }




    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return ageList.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return lastNameList.stream()
                .sorted((p1,p2) -> p1.getLastName().compareTo(p2.getLastName()))
                .toList();
    }

    // O(1)
    @Override
    public int size() {
        return idList.size();
    }


}