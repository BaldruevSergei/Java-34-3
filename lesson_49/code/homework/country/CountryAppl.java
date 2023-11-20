package homework.country;

import java.util.Comparator;
import java.util.LinkedList;

public class CountryAppl {
    public static void main(String[] args) {

        // cоздаем список, содержащий 11 стран с самым большим населением по  континентам
        LinkedList<Country> lists = new LinkedList<>();
        lists.add(new Country("India", 1428.8, "Asia"));
        lists.add(new Country("China", 1426.7, "Asia"));
        lists.add(new Country("Indonesia", 277.5, "Asia"));
        lists.add(new Country("USA", 340.0, "Northern America"));
        lists.add(new Country("Mexico", 128.5, "Northern America"));
        lists.add(new Country("Brazil", 216.5, "South America"));
        lists.add(new Country("Russia", 144.3, "Europe"));
        lists.add(new Country("Germany", 84.2, "Europe"));
        lists.add(new Country("Egypt", 117.3, "Africa"));
        lists.add(new Country("Ethiopia", 122.3, "Africa"));
        lists.add(new Country("Australia", 26.9, "Australia"));

        // выводим список на печать

        for (Country d : lists) {
            System.out.println(d);

        }

        // реализуем компаратор sort by name from a to z

        Comparator<Country> comparatorByName = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {

                return o1.getName().compareTo(o2.getName());
            }

        };
        lists.sort(comparatorByName);
        System.out.println();
        System.out.println("================Sort By Name from a to z  ==================");
        for (Country d : lists) {
            System.out.println(d);
        }


        // реализуем компаратор sort by name from z to a
        Comparator<Country> comparatorByNamerRevers = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };
        lists.sort(comparatorByNamerRevers);
        System.out.println();
        System.out.println("================Sort By Name from z to a  ==================");
        for (Country d : lists) {
            System.out.println(d);
        }


        // реализуем компаратор sort by population from 1 to 0
        Comparator<Country> comparatorByPopulatuion = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return Double.compare(o2.getPopulation(), o1.getPopulation());
            }
        };
        System.out.println();
        lists.sort(comparatorByPopulatuion);
        System.out.println("================Sort by population from 1 to 0 ==================");
        for (Country d : lists) {
            System.out.println(d);
        }


        //реализуем компаратор sort by population from 0 to 1

        Comparator<Country> comparatorByPopulatuionRevers = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
            return  Double.compare(o1.getPopulation(), o2.getPopulation());
            }
        };
        lists.sort(comparatorByPopulatuionRevers);

        System.out.println("================Sort by population from 0 to 1 ==================");
        for (Country d : lists) {
            System.out.println(d);}

        //реализуем компаратор принадлежности континенту и размеру населения в порядке от большего к меньшему.

        Comparator<Country> comparatorByContinentByPopulation = new Comparator<Country>() {


            @Override
            public int compare(Country o1, Country o2) {
                // 1. sort принадлежности континенту
                int compareContinent = o1.getContinent().compareTo(o2.getContinent());
                // 1. sort по населению
                int comparePopulation = Double.compare(o2.getPopulation(), o1.getPopulation());
                if (compareContinent != 0) { // если это условие то значит   не провели сортировку по континенту
                    return compareContinent;// вовзращаемся сначала ее провести
                }
                return comparePopulation; // (иначе это значит провели сортировку по континенту и для них  проводим сортировку по населению от большего к меньшему)
            }
        };
        lists.sort(comparatorByContinentByPopulation);
        System.out.println();
        System.out.println("================ Компаратор по принадлежности континенту и размеру населения в порядке от большего к меньшему ==================");
        for (Country d : lists) {
            System.out.println(d);}

    }
}




