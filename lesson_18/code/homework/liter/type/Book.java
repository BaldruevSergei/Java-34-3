package homework.liter.type;

public class Book {
    private String title;
    private String author;
    private int year;
    private int isbn;

    public Book(String title, String author, int year, double isbn) {
    }


    public void display(){
        System.out.println("Title  "  +  title);
        System.out.println("author "  +  author);
        System.out.println("year   "  +  year);
        System.out.println("isbn   "  + isbn );
    }
}
