package homework.sportmens;

import java.util.Objects;

public class Sportsmen implements Comparable<Sportsmen>{
    private String lastName;
    private String name;
    private int reg;
    private String Commands;
    private double result;

    public Sportsmen(String lastName, String name, int reg, String commands, double result) {
        this.lastName = lastName;
        this.name = name;
        this.reg = reg;
        Commands = commands;
        this.result = result;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }

    public String getCommands() {
        return Commands;
    }

    public void setCommands(String commands) {
        Commands = commands;
    }

    public  double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", reg=" + reg +
                ", Commands='" + Commands + '\'' +
                ", result=" + result +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsmen sportsmen = (Sportsmen) o;
        return reg == sportsmen.reg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reg);
    }



    @Override
    public int compareTo(Sportsmen o) {
        return Double.compare(this.result, o.result);
    }
}
