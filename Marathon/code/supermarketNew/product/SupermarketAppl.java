package supermarketNew.product;


import supermarketNew.product.dao.Supermarket1Impl;
import supermarketNew.product.model.Food1;
import supermarketNew.product.model.Menu;
import supermarketNew.product.model.Product1;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SupermarketAppl implements Serializable {
    public static void main(String[] args) {
        System.out.println("Welcome to Supermarket.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice quantity positions in your Supermarket");
        int q = scanner.nextInt();
        Supermarket1Impl kiosk = new Supermarket1Impl(q);
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
                            scanner.nextLine(); // Очистка буфера после ввода числовых данных
                            String name = scanner.nextLine(); // Используйте nextLine() для ввода строки
                            System.out.println("Input price: ");
                            double price = scanner.nextDouble();
                            LocalDateTime currTime = LocalDateTime.now();
                            kiosk.addProduct(new Product1(barcode, name, price, currTime));
                        } else {
                            System.out.println("Input barcode: ");
                            long barcode = scanner.nextLong();
                            System.out.println("Input name ");
                            scanner.nextLine(); // Очистка буфера после ввода числовых данных
                            String name = scanner.nextLine(); // Используйте nextLine() для ввода строки
                            System.out.println("Input price: ");
                            double price = scanner.nextDouble();
                            LocalDateTime currTime = LocalDateTime.now();
                            System.out.println("Input exDate");
                            scanner.nextLine();
                            String exDate = scanner.next();
                            System.out.println("Input organic (true or false)");
                            boolean organic = scanner.nextBoolean();
                            kiosk.addProduct(new Food1(barcode, name, price, currTime, exDate, organic));
                        }
                        scanner.nextLine(); // Очистка буфера после ввода данных
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
                        System.out.println("Save product to Supermarket");
                        List<Supermarket1Impl> products = new ArrayList<>();
                        products.add(kiosk);
                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\ОИВТ\\Java\\AItTR-Java-Cuse-2023\\Marathon\\code\\supermarketNew\\product\\supermarket.dat"))) {
                            oos.writeObject(products);
                            System.out.println("Products are written to the file");
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    }
                    case 6: {
                        System.out.println("Read product from file");
                        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\ОИВТ\\Java\\AItTR-Java-Cuse-2023\\Marathon\\code\\supermarketNew\\product\\supermarket.dat"))) {
                            List<Supermarket1Impl> products = (List<Supermarket1Impl>) ois.readObject();
                            System.out.println("Products are read");

                            // Проход по списку и вывод информации
                            for (Supermarket1Impl s : products) {
                                kiosk.printAllProducts();
                            }
                        } catch (IOException | ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        break;
                    }



                        case 7:{ System.out.println("Delete position from Supermarket: ");
                        scanner.nextLine();
                        System.out.println("Input barcode: ");
                        long barcode = scanner.nextLong();


                        if (kiosk.removeProduct(barcode) == false) {
                            System.out.println("This product does not exist" + barcode);
                        } else
                            System.out.println(" Your successfully delete position  " + "  barcode  " + barcode + "and your position in Supermarket  now : ");
                        kiosk.printAllProducts();
                        break;

                    }
                    case 8: {
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
