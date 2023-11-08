package supermarketNew.product;


import supermarketNew.product.dao.Supermarket1;
import supermarketNew.product.model.Food1;
import supermarketNew.product.model.Menu;
import supermarketNew.product.model.Product;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SupermarketAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to Supermarket.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice quantity positions in your Supermarket");
        int q = scanner.nextInt();
        Supermarket1 kiosk = new Supermarket1(q);
        LocalDateTime time = LocalDateTime.now();
        try {
            // начало цикла
            while (true) {
                // print menu
                Menu.printMenu(); // статический метод вызывается по имени класса
                // ask choice
                System.out.println("Input your choice: ");
                int choice = scanner.nextInt();


                switch (choice) {
                    case 1: {

                        System.out.println(" choice Product  - number 1   or   Food  - number 2");

                        int a = scanner.nextInt();
                        if (a == 1) {
                            System.out.println("Input barcode: ");
                            long barcode = scanner.nextLong();
                            System.out.println("Input name ");
                            scanner.nextLine(); // переход на новую строку и ожидание ввода
                            String name = scanner.next();
                            scanner.nextLine(); // переход на новую строку и ожидание ввода
                            System.out.println("Input price: ");
                            double price = scanner.nextDouble();
                            LocalDateTime currTime = LocalDateTime.now();
                            kiosk.addProduct(new Product(barcode, name, price, currTime)); break;
                        } else  {
                            System.out.println("Input barcode: ");
                            long barcode = scanner.nextLong();
                            System.out.println("Input name ");
                            scanner.nextLine(); // переход на новую строку и ожидание ввода
                            String name = scanner.next();
                            scanner.nextLine(); // переход на новую строку и ожидание ввода
                            System.out.println("Input price: ");
                            double price = scanner.nextDouble();
                            LocalDateTime currTime = LocalDateTime.now();
                            System.out.println("Input  exDate");
                            scanner.nextLine();
                            String exDate = scanner.next();
                            System.out.println("Input  organic (truth or false)");
                            scanner.nextLine();
                            boolean organic = scanner.nextBoolean();
                            kiosk.addProduct(new Food1(barcode, name, price, currTime, exDate, organic));
                        }
                        break;
                    }

                    case 2: {
                        System.out.println("List of position  in Supermarket: ");
                        kiosk.printAllProducts();
                        break;
                    }
                    case 3: {
                        System.out.println("Quantity of position  in Supermarket: ");
                        System.out.println(q);
                        break;
                    }
                    case 4: {
                        System.out.println(" Search  of position  in Supermarket: ");
                        scanner.nextLine();
                        System.out.println("Input  barcode ");
                        long barcode = scanner.nextInt();
                        kiosk.findProduct(barcode);
                        if (kiosk.findProduct(barcode) == null) {
                            System.out.println("This position  does not exist");
                        } else System.out.println(" Your position  : " + kiosk.findProduct(barcode));
                        break;

                    }
                    case 5: {
                        System.out.println("Delete position from Supermarket: ");
                        scanner.nextLine();
                        System.out.println("Input barcode: ");
                        long barcode = scanner.nextLong();


                        if (kiosk.removeProduct1(barcode) == false) {
                            System.out.println("This product does not exist" + barcode);
                        } else
                            System.out.println(" Your successfully delete position  " + "  barcode  " + barcode + "and your position in Supermarket  now : ");
                        kiosk.printAllProducts();
                        break;
                    }
                    case 6: {
                        return;
                    }
                    default: {
                        System.out.println("Wrong input.");
                    }
                }
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
