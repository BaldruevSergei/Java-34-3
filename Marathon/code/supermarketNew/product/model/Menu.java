package supermarketNew.product.model;

import java.io.Serializable;

public enum Menu implements Serializable {
    ADD(1, "Add product"), LIST(2, "List of products"), QUANTITY(3, "Quantity"), VEW (4,"vew product"),SAVE(5,"save product"),READ(6,"Read product"), DELET (7,"Delete product"),EXIT(7, "Exit");

    //fields
    private int menuItem;
    private String action;

    // constructor
    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    // метод, void - ничего не возвращает, он печатает
    public static void printMenu(){
        Menu[] menu = Menu.values(); // put enum items into array
        for (int i = 0; i < menu.length; i++) {
            System.out.print((menu[i].menuItem) + " - " + menu[i].action + " | ");
        }
        System.out.println(); // new line
    }
}

