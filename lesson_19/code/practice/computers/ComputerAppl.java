package practice.computers;

import practice.computers.model1.Computer;
import practice.computers.model1.Laptop;
import practice.computers.model1.SmartPhone;

public class ComputerAppl {
    public static void main(String[] args) {


        Computer[] comp = new Computer[3];
        comp[0] = new Computer("I9", 16, 512, "Asus");
        // System.out.println(comp[0]);
        comp[1] = new Laptop("i5", 8, 256, "Acer", "14", 1000, 2);
        //  System.out.println(comp[1]);
        comp[2] = new Laptop("M2", 16, 512, "MacBook", "14", 5000, 1.6);


        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i]);
        }

        int sumHdd = 0;
        for (int i = 0; i < comp.length; i++) {
            sumHdd = sumHdd + comp[i].getHdd();
        }

        System.out.println("Total HDD = " + sumHdd);

        SmartPhone[] smart1 = new SmartPhone[4];
        smart1[0] = new SmartPhone("A1", 6, 512, "Iphone", "6", 4500, 0.4, 6, "iOS", "5G");
        smart1[1] = new SmartPhone("A2", 4, 128, "Iphone", "5.5", 4500, 0.2, 12, "iOS", "5G");
        smart1[2] = new SmartPhone("A3", 8, 1024, "Iphone", "6.5", 5500, 0.6, 12, "iOS", "5G");
        smart1[3] = new SmartPhone("A0", 8, 256, "Iphone", "4.5", 2500, 0.6, 4, "iOS", "5G");

        for (int i = 0; i < smart1.length; i++) {
            System.out.println(smart1[i]);
        }
        int shdd = 0;
        int sram = 0;
        for (int i = 0; i < smart1.length; i++) {
            shdd = shdd + smart1[i].getHdd();
            sram = sram + smart1[i].getRam();
        }
        System.out.println("Total HDD = " + shdd + "    Total RAM = " + sram);


    }
}

