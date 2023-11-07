package homework.Archive.dao;

import homework.Archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArhiveImplTest {
    Archive archive;
    LocalDateTime now = LocalDateTime.now();
    Document[] doc;

    @BeforeEach
    void setUp() {
        archive = new ArhiveImpl(7);
        doc = new Document[6];
        doc[0] = new Document(1, 1, "d1", "url1", now.minusDays(2));
        doc[1] = new Document(1, 2, "d2", "url1", now.minusDays(3));
        doc[2] = new Document(1, 3, "d3", "url1", now.minusDays(5));
        doc[3] = new Document(2, 1, "d1", "url1", now.minusDays(7));
        doc[4] = new Document(2, 2, "d2", "url1", now.minusDays(7));
        doc[5] = new Document(2, 3, "d3", "url1", now.minusDays(7));
        for (int i = 0; i < doc.length; i++) {
            archive.addDocuments(doc[i]);

        }

    }


    @Test
    void addDocuments() {
        // нельзя добавить null
        assertFalse(archive.addDocuments(null));
        // нельзя добавить имеющееся
        assertFalse(archive.addDocuments(doc[1]));
        archive.viewArchive();
        // проверит возможность добавления
        Document document = new Document(3, 1, "t", "url", now);
        assertTrue(archive.addDocuments(document));
        assertEquals(7, archive.size());
        // проверить ожадаемое кол-ко
        // нельзя превысить capasity
        System.out.println("-----------------------");
        archive.viewArchive(); // после добавления
        // проверяем, что нельзя добавить еще один из-за достижения capacity
        document = new Document(3, 2, "t", "url", now);
        assertFalse(archive.addDocuments(document));
    }

    @Test
    void updateDocuments() {
        assertTrue(archive.updateDocuments(1, 1, "newUrl")); // Обновили url
        assertEquals("newUrl", archive.getDocumentFromArchive(1, 1).getUrl()); // проверили что он обнов
    }

    @Test
    void getDocumentFromArchive() {
        assertEquals(doc[0], archive.getDocumentFromArchive(1, 1)); // проверяем нахоэдение документа
        assertNull(archive.getDocumentFromArchive(1, 4)); // ищем не существующий документ
    }

    @Test
    void getAllDocumentFromArchive() {
        // этот метод массив документов
        Document[] expected = {doc[3], doc[4], doc[5]}; // это выбрали aльбом 2
        Document[] actual = archive.getAllDocumentFromArchive(2); // выбрали альбом 2
        Arrays.sort(actual); // сортируем массив
        assertArrayEquals(expected, actual);

    }

    @Test
    void getDocumentBetweenDate() {
        LocalDate ld = now.toLocalDate(); // оставляем только дату
        Document[] actual = archive.getDocumentBetweenDate(ld.minusDays(6), ld.minusDays(1));
        Arrays.sort(actual); // сортируем массив
        Document[] exected = {doc[0], doc[1], doc[2]};
        assertArrayEquals(exected, actual);
    }

    @Test
    void size() {
        assertEquals(6, archive.size());
    }

    @Test
    void viewDocumentsTest() {
        archive.viewArchive(); // до сортировки
        Arrays.sort(doc);
        archive.viewArchive(); // после сортировки
    }
}