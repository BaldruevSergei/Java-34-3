package homework.Archive.dao;

import homework.Archive.model.Document;

import java.time.LocalDate;

public interface Archive {
    boolean addDocuments(Document document);
    boolean updateDocuments(int folderId, int documentId, String url);
    boolean removeDocument(int folderId, int documentId);
    Document getDocumentFromArchive(int folderId, int documentId);
    Document[] getAllDocumentFromArchive(int folderId);
    Document[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size(); // quantity of documents in all arhive
    void viewArchive(); // метод печать содержимого


}
