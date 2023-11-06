package homework.library.test;

import homework.library.model.Book;
import homework.library.dao.LibrairyImpl;
import homework.library.dao.Librairy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LibrairyImplTest {
    Librairy librairy;
    Book[] e;


    @BeforeEach
    void setUp() {
        librairy = new LibrairyImpl(5);
        e = new Book[4];
        e[0] = new Book(1001l,"O'Genri","New-York", 1889);
        e[1] = new Book(1002l,"А.И.Лажечников","Басурман", 1835);
        e[2] = new Book(1003l,"Э.Сетон-Томпсон","Мустанг-Иноходец", 1931);
        e[3] = new Book(2003L,"O'Genri", "Дары Волхов", 1899);
        for (int i = 0; i < e.length; i++) {
            librairy.addBook(e[i]);}


    }

    @Test
    void addBook() {
        // не можем добавить null
        assertFalse(librairy.addBook(null));
        // не можем добавить второй раз, уже существующий
        assertFalse(librairy.addBook(e[1]));
        Book book1 = new Book(1005l, "I", "12", 2006); // создали Новую книгу
        assertTrue(librairy.addBook(book1)); // добавили новую книгу
        assertEquals(5, librairy.quantity()); // теперь в библиотеке  5 книг        // создаем еще одну
        Book book2 = new Book(1006l, "P", "D", 2023); // создали новую книгу
        assertFalse(librairy.addBook(book2)); // не можем превысить capacity
    }




    @Test
    void removeBook() {
        assertEquals(e[1], librairy.removeBook(1002l));
        assertEquals(3,librairy.quantity());
        assertNull(librairy.removeBook(1002l));
        assertNull(librairy.findBook(1002l));

    }

    @Test
    void findBook() {
        assertEquals(e[1], librairy.findBook(1002l));
        // ищем несуществующ книгу
       // assertNull(librairy.findBook(1005l));

    }

    @Test
    void quantity() {
        assertEquals(4,librairy.quantity());
    }

    @Test
    void printBook() {
        librairy.printBook();
    }
}