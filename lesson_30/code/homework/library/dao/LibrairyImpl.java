package homework.library.dao;

import homework.library.model.Book;

public class LibrairyImpl implements Librairy {
    private  Book[] books;
    int size;
    public  LibrairyImpl(int capacity){
        books = new Book[capacity];
    }


    @Override
    public boolean addBook(Book book) {
        // не добавляем null, не привышаем capacity, не добаляем уже существующего
        if (book == null || size == books.length || findBook(book.getIsbn()) != null){
            return false;
        }
        books[size] = book; // новый элемент
        size++;
        return true;

    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                Book victim = books[i];
                books[i]=books[size-1];
                books[size-1]=null;
                size--;
                return victim;


            }
        }
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn()==isbn){
                return books[i];

            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }


    }
}
