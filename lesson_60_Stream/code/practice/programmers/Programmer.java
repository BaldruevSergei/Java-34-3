package practice.programmers;

import java.util.Arrays;

public class Programmer {
    // в этом классе нам нужно учесть состав и языков программирования которые знает программист (Technology)
    // Чем больше языков (кл-во), тем "круче"

    String name;
    String[] technologies; // стек технологий

    public Programmer(String name, String... technologies) { // "varargs (variable argument)"
        // позволаят массивы разной длины
        this.name = name;
        this.technologies = technologies;
    }

    public String getName() {
        return name;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", technologies=" + Arrays.toString(technologies) +
                '}';
    }
}
