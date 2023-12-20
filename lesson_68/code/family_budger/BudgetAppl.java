package family_budger;

import family_budger.dao.BudgetImpl;
import family_budger.model.Menu;
import family_budger.model.Product;
import family_budger.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetAppl {
    public static void main(String[] args) {

        List<Purchase> purchaseList = new ArrayList<>(); // ??
        List<Product> productList = new ArrayList<>(); // ok

        BudgetImpl budget = new BudgetImpl(purchaseList, 0);
        LocalDate now = LocalDate.now();



        while (true) {
            Menu.printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Input  your choice: ");

            int choice  = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Input budget amount: ");
                    double addedBudget = scanner.nextDouble();
                    budget.addMoney(addedBudget);
                    System.out.println("Budget updated successfully!");

                }
                case 2 ->{
                    // load data
                    // print

                }
                case 3 -> {
                    System.out.println("Purchases by Stores");
                    // вызвать метод
                    // print
                }
                case 4 -> {
                    System.out.println("Purchases by Person");
                    // вызвать метод
                    // print
                }
                case 5 -> {
                    System.out.println("Purchases by Period");
                    // вызвать метод
                    // print
                }

                case 6 -> {
                    System.out.println("Input amount of purchase");
                    // вызвать метод
                    // print
                }
                case 7 -> {
                    return;
                }
                default -> {
                    System.out.println(" Wrong choice. ");
                }
            }


        }

    }
}
