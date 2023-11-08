package homework.Archive;

import homework.Archive.dao.ArhiveImpl;
import homework.Archive.model.Document;
import homework.Archive.model.Menu;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ArchiveAppl extends ArhiveImpl {
    public ArchiveAppl(int capacity) {
        super(capacity);
    }

    public static void main(String[] args) {


        // greeting
        System.out.println("Welcome to Archive.");
        ArhiveImpl archive = new ArchiveAppl(100);
        LocalDateTime time = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        try {
        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice

            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute

                switch (choice) {
                    case 1: {
                        scanner.nextLine();
                        System.out.println("Input folder ID: ");
                        int folderId = scanner.nextInt();
                        System.out.println("Input document ID: ");
                        int documentId = scanner.nextInt();
                        scanner.nextLine(); // переход на новую строку и ожидание ввода
                        System.out.println("Input document title: ");
                        String title = scanner.nextLine();
                        System.out.println("Input document url: ");
                        String url = scanner.nextLine();
                        LocalDateTime currTime = LocalDateTime.now();
                        Document document = new Document(folderId, documentId, title, url, currTime);
                        archive.addDocuments(document);
                        break;
                    }
                    case 2: {
                        System.out.println("List of documents in Archive: ");
                        archive.viewArchive();
                        break;
                    }
                    case 3: {
                        System.out.println("Quantity of documents in Archive: ");
                        System.out.println(archive.size());
                        break;
                    }
                    case 4:{
                        System.out.println("getDocumentFromArchive: ");
                        scanner.nextLine();
                        System.out.println("Input folder ID: ");
                        int folderId = scanner.nextInt();
                        System.out.println("Input document ID: ");
                        int documentId = scanner.nextInt();
                        Document document = archive.getDocumentFromArchive(folderId,documentId);
                        if (document == null){
                            System.out.println("This document does not exist");
                            }
                        else System.out.println(" Your document : " + document);
                        break;

                    }
                    case 5: {
                        System.out.println("Delete document from Archive: ");
                        scanner.nextLine();
                        System.out.println("Input folder ID: ");
                        int folderId = scanner.nextInt();
                        System.out.println("Input document ID: ");
                        int documentId = scanner.nextInt();
                        boolean document = archive.removeDocument(folderId,documentId);
                        if (document == false){
                            System.out.println("This document does not exist");
                        }
                        else System.out.println(" Your successfully delete document " + "  folderId  " + folderId + "  documentId  " + documentId + "and your archive now : ");
                        archive.viewArchive();
                        break;
                    }
                    case 6:{
                        return;
                    }
                    default: {
                        System.out.println("Wrong input.");
                    }
                }
            }

            }catch (Exception e) {
            System.out.println(e.toString() + " , " + e.getMessage() + " , " + e.getCause() + "Wrong input");


        }
        }
}

