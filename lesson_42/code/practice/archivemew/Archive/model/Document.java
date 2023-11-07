package practice.archivemew.Archive.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Document implements Comparable<Document> {
    private int folderId;
    private  int documentId;

    private  String url;
    private LocalDateTime date;
    // constructor
    public Document(int folderId, int documentId, String name, String url, LocalDateTime date) {
        this.folderId = folderId;
        this.documentId = documentId;

        this.url = url;
        this.date = date;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "folderId=" + folderId +
                ", documentId=" + documentId +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document archive = (Document) o;
        return folderId == archive.folderId && documentId == archive.documentId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(folderId, documentId);
    }

    @Override
    public int compareTo(Document o) {
        // надо опеределить как сортировать объекты в массиве Document под двум полям folderId  и documentId
        int res = Integer.compare(folderId, o.folderId);

        return res != 0 ? res: Integer.compare(documentId, o.documentId); // тернарный оператор


    }
}
