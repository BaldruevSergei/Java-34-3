package practice.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public Library() {
        init();
    }
    private List<Book> books;
    private List<Reader> readers;


    private  void  init(){
        books = new ArrayList<>();
        books.add(new Book("George Orwell", "1984", 1949));
        books.add(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 1997));
        books.add(new Book("J.R.R. Tolkien", "The Lord of the Rings", 1954));
        books.add(new Book("Harper Lee", "To Kill a Mockingbird", 1960));
        books.add(new Book("F. Scott Fitzgerald", "The Great Gatsby", 1925));
        books.add(new Book("Leo Tolstoy", "War and Peace", 1869));

        // добавляем читателей
        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true)); // 0
        readers.add(new Reader("Петров Петр Петрович", "petrov.email@test.ru", true)); // 1
        readers.add(new Reader("Сидоров Сергей Сергеевич", "sidiriv.email@test.ru", true)); // 2

        // журнал выдачи книг
        readers.get(0).getBooks().add(books.get(0)); // Иванов взял книгу Джордж Оруэлл
        readers.get(1).getBooks().add(books.get(0)); // Петров взял книгу Оруэлла
        readers.get(1).getBooks().add(books.get(1)); // Петров взял книгу с индексом 1
        readers.get(1).getBooks().add(books.get(4)); // Петров взял книгу с индексом 4
        readers.get(2).getBooks().add(books.get(0)); // Сидоров взял Оруэлла
        readers.get(2).getBooks().add(books.get(2)); // Сидоров взял Tolkien



    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
