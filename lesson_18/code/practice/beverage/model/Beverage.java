package practice.beverage.model;

public class Beverage {

    // fields

    private String title;
    private  String packing;
    private int quantity;
    //  конструктор
    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    // метод для покупки
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public  void toBuy(String title, String packing, int quantity){
 //       this.title = title;
 //       this.packing=packing;
 //      this.quantity = quantity;
        System.out.println("Go to market and buy : " + title + "  " + packing + " "+ quantity + " . " );
    }
    // метод для проверки того что осталось на складе
    public void displayStock(){
        System.out.println(" We have : " + title + " " + packing + " " + quantity + " ." );
    }

}
