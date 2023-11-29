package practice.citizens_v2;

import practice.citizens_v2.dao.Citizens;
import practice.citizens_v2.dao.CitizensHashSetImpl;
import practice.citizens_v2.model.Person;

import java.time.LocalDate;

public class CitizensImplAppl {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        Citizens citizens = new CitizensHashSetImpl();
        citizens.add(new  Person(4, "Bruce", "Willis", now.minusYears(25)));
        citizens.add(new Person(2, "John", "Smith", now.minusYears(20)));
        citizens.add(new Person(3, "Mary", "Jackson", now.minusYears(23)));
        citizens.add(new Person(1, "Peter", "Jackson", now.minusYears(23)));




        System.out.println("All persons:");
        Iterable<Person> personsById = citizens.getAllPersonsSortedById();
        Iterable<Person> personsByAge = citizens.getAllPersonsSortedByAge();
        Iterable<Person> personsByLastName = citizens.getAllPersonsSortedByLastName();
        System.out.println("Persons sorted by ID:");
        printPersons(personsById);

        System.out.println("\nPersons sorted by age:");
        printPersons(personsByAge);

        System.out.println("\nPersons sorted by last name:");
        printPersons(personsByLastName);




    }

    private static void printPersons(Iterable<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);

        }
    }
}

