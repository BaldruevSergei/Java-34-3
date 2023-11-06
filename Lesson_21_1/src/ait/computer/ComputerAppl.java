package ait.computer;

import ait.computer.model.Computer;
import ait.computer.model.Laptop;
import ait.computer.model.Smartphone;

public class ComputerAppl {
            
    public static void main(String[] args) {
        double a = 10; // upper casting
        int b = (int) a; // down casting


        int[] arr = new int[10];

        Computer[] shop = new Computer[5];
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone("Snapdragon", 8, 128, "Samsung", 24,
                0.15, 123456789098l);
        printArray(shop);
        int total = getTotalSSDCapacity(shop);
        System.out.println("Total ssd capacity = " + total);
        Laptop laptop1 = (Laptop) shop[1];
        laptop1.setHours(4.5);
        System.out.println(laptop1);
        System.out.println(shop[1]);// down casting

//        Object computer = new Computer("i5", 12, 512, "HP");
//        Object laptop = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
//        System.out.println(computer);
//        System.out.println(laptop);


    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);

            }
        }
    }

    public static int getTotalSSDCapacity(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {

                res += arr[i].getSsd(); // res = res + arr[i].getSsd()
            }
        }
        return res;
    }
    // суммарное значение время работы всех батарей

    // подсчитать SSDCapacity только у laptop
}

