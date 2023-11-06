package homework.library.dao;

import homework.library.model.Book;

public interface Librairy {
    boolean addBook(Book book);
    Book removeBook(long isbn);
    Book findBook(long isbn);
    int quantity();
    void printBook();
}

