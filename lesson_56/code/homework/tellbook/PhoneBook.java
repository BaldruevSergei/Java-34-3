package homework.tellbook;

import homework.tellbook.model.Contact;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private static ArrayList<Contact> contacts = new ArrayList<>(); // создаем массив ArrayList

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Вывести все контакты");
            System.out.println("3. Найти контакт");
            System.out.println("4. Удалить контакт");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    printAllContacts();
                    break;
                case 3:
                    findContact(scanner);
                    break;
                case 4:
                    deleteContact(scanner);
                    break;
                case 5:
                    saveContactsToFile();
                    System.out.println("Выход из приложения.");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }

    private static void saveContactsToFile() {
        try {
            File myObj = new File("D:\\phonebook.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    private static void deleteContact(Scanner scanner) {
        System.out.println("Введите имя контакта для удаления:");
        String nameToDelete = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(nameToDelete)) {
                contacts.remove(contact);
                System.out.println("Контакт удален: " + contact.getName() + ", " + contact.getPhoneNumber());
                return;
            }

        }
    }

    private static void findContact(Scanner scanner) {
        System.out.println("Введите имя для поиска:");
        String nameToFind = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(nameToFind)) {
                System.out.println("Контакт найден: " + contact.getName() + ", " + contact.getPhoneNumber());
                return;
            }
        }

    }

    private static void printAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Телефонная книга пуста.");
        } else {
            System.out.println("Список контактов:");
            for (Contact contact : contacts) {
                System.out.println(contact.getName() + ", " + contact.getPhoneNumber());
            }
        }

    }

    private static void addContact(Scanner scanner) {
        System.out.println("Введите имя контакта:");
        String name = scanner.nextLine();

        System.out.println("Введите номер телефона:");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);

        System.out.println("Контакт добавлен: " + contact.getName() + ", " + contact.getPhoneNumber());
    }
}



