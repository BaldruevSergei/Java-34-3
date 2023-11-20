package homework.country;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        // 1. sort принадлежности континенту
        int compareContinent = o1.getContinent().compareTo(o2.getContinent());
        // 1. sort по населению
        int comparePopulation = Double.compare(o2.getPopulation(), o1.getPopulation());
        if (compareContinent !=0) {
            return compareContinent;}
        return comparePopulation;
        };
    }

