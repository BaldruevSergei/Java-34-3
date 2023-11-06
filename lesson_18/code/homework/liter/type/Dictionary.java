package homework.liter.type;

public class Dictionary extends Book  {
    private String genre;
    private String type;
    private String audience;
    private String printing;
    public Dictionary(String title, String author, int year, double isbn, String genre, String type, String audience, String printing) {
        super (title, author, year, isbn);
        this.genre = genre;
        this.type = type;
        this.audience=audience;
        this.printing=printing;
    }

    public void display(){
        super.display();
        System.out.println("genre    " +  genre );
        System.out.println("type     " +  type );
        System.out.println("audience " +  audience);
        System.out.println("printing " +  printing);
    }
}


