package homework.cube.model;

import java.util.Scanner;

public class Cube {

    public int number; // сторона куба

    public Cube(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int Number (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter  side of cube ");
        int x = scanner.nextInt();
        return x;
    }

    public void Perimetr(int p){
        p = p * 12;
        System.out.println("Perimetr = " + p);
    }

    public void Square(int s){
        s = s * s * 6;
        System.out.println("Square = " + s);
    }

    public void Volume(int v){
        v = v * v * v;
        System.out.println("Volume = " +v);
    }

    public void Display(){
        System.out.println(" Side " + number);
    }

    public void line(){
        System.out.println("________________________________________________");
    }


}
