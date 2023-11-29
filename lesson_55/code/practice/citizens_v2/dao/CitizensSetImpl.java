package practice.citizens_v2.dao;

import practice.citizens_v2.model.Person;

import java.time.LocalDate;
import java.util.*;

public class CitizensSetImpl implements Citizens {

    // fields
    private TreeSet<Person> idList; // список граждан по id

    private TreeSet<Person> lastNameList; // список граждан по фамилиям

    private TreeSet<Person> ageList; // список граждан по возрасту

    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName()); // сортировка по алфавиту по фамилиям
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по id
    };

    private static Comparator<Person> ageComparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge()); // сортировка по кол-ву лет
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по id
    };

    // constructor
    // пустой конструктор
    public CitizensSetImpl() {
        idList = new TreeSet<>(); // создаем пустой лист
        lastNameList = new TreeSet<>(lastNameComparator);
        ageList = new TreeSet<>(ageComparator);
    }

    public CitizensSetImpl(List<Person> citizens) {
        this(); // вызов пустого конструктора
        for (Person person : citizens) {
            citizens.forEach(p->add(p));
        }
    }
    // O(log(n))
    @Override
    public boolean add(Person person) {

        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }

    // O(log(n))
    @Override
    public boolean remove(int id) {
        Person person = find(id);

            return person != null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
    }


    // O(log(n))
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, null, null, null);
        Person person = idList.ceiling(pattern); // Метод ищет в бинарном  дереве снизу вверх
        return pattern.equals(pattern) ? person : null ; // нашли и вернули объект по индексу
    }

    // O(log(n))
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person from = new Person(idList.first().getId() - 1, null, null, now.minusYears(minAge));
        Person to = new Person(idList.last().getId() + 1, null, null, now.minusYears(maxAge));
        return ageList.subSet(from, to); // берем подмножество
    }

    // 0(log(n))
    @Override
    public Iterable<Person> find(String lastName) {
        Person from = new Person(Integer.MIN_VALUE, null, lastName,null);
        Person to = new Person(Integer.MAX_VALUE, null, lastName, null);
        return lastNameList.subSet(from, to);
    }

    // 0(1)
    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return idList;
    }

    // 0(1)
    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return ageList;
    }

    // 0(1)
    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return lastNameList;
    }

    // 0(1)
    @Override
    public int size() {
        return idList.size();
    }
}

