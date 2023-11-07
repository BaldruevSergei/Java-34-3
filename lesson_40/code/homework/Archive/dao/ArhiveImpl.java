package homework.Archive.dao;

import homework.Archive.model.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArhiveImpl implements Archive{
 // этот компаратор позволяет делать  сортировку по дате и по ID документа
    static Comparator<Document> comparator = (p1,p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());
        return  res!=0 ? res :Integer.compare(p1.getDocumentId(),p2.getDocumentId());
    };
   private Document [] documents; // хранение документов в массиве
   private  int size; // кол-во документов
   public ArhiveImpl(int capacity){
       documents = new Document[capacity];
       // this.size = 0;
   }

    @Override
    public boolean addDocuments(Document document) {
        if (document == null || size == documents.length || getDocumentFromArchive(document.getFolderId(), document.getDocumentId()) != null) {

            return false;
        };
            // ищем индекс куда вставить
            int index = Arrays.binarySearch(documents, 0, size, document, comparator);
            // ищем индекс
            index = index >= 0 ? index : -index - 1; // навшли индекс куда ставить элеметн массива
            // раздвигаем массив с индекса на 1 место вправо
            System.arraycopy(documents,index,documents,index+1,size - index); // раздвинули массив
            documents[index] = document; // вставили документ
            size++; // увеличили размер хранилища
            return true;

        }


    @Override
    public boolean updateDocuments(int folderId, int documentId, String url) {
       Document document = getDocumentFromArchive(folderId, documentId); // нашли документ(объект)
        if (document == null) {
            return false;
        }
        document.setUrl(url);
        return true;
    }

    @Override
    public boolean removeDocument(int folderId, int documentId) {
        // ищем фото
        for (int i = 0; i < size; i++) {
            if(documents[i].getFolderId() == folderId && documents[i].getDocumentId() == documentId){
                // надвигаем массив на найденную позицию i удаляемого фото
                System.arraycopy(documents, i + 1, documents, i, size - 1 - i);
                // size--;
                documents[--size] = null;
                return true;
            }
        }
        return false;

    }

    @Override
    public Document getDocumentFromArchive(int folderId, int documentId) {
       Document pattern = new Document(folderId,documentId,null,null,null); // определили  тот объект с которым сравниваем
        for (int i = 0; i < size; i++) {
             if (pattern.equals(documents[i])){
                 return documents[i];
             }
        }
        return null;
    }

    @Override
    public Document[] getAllDocumentFromArchive(int folderId) {
       return findByPredicate(p ->  folderId == p.getFolderId());

    }
    private  Document[] findByPredicate(Predicate<Document> predicate){ // из метода возвращаем массив найденных объектов
       Document[] res = new Document[size]; // объявили массив избыточной длины
        int j = 0;// счетчик найденных документов  в архиве
        for (int i = 0; i < size; i++) {
            if (predicate.test(documents[i])){
                res[j++] = documents[i];
                //j++;

            }


        }
        // заполнили массив но в нем много поле индекса J идут null
        return Arrays.copyOf(res,j); // вернули обрезанный массив, без элементов null
    }

    @Override
    public Document[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
       Document pattern = new Document(0,Integer.MAX_VALUE,null,null, dateFrom.atStartOfDay());
        // ввели объектную переменную
       int from = -Arrays.binarySearch(documents,0,size,pattern,comparator) -1; // находим индекс начального фото
        // край from = from>=0 ? from: -from -1
        pattern = new Document(0,Integer.MAX_VALUE,null,null, LocalDateTime.of(dateTo, LocalTime.MAX));
        // правый край
        int to = -Arrays.binarySearch(documents,0,size,pattern,comparator) -1;

        return Arrays.copyOfRange(documents,from,to);
    }

    @Override
    public int size() {
        return size;
    }
    public void viewArchive() { // печатаем весь массив
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
        System.out.println("You have " + size + " documents.");
    }


}
