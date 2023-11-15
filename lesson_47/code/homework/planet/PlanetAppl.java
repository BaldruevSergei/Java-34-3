package homework.planet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl {
    public static void main(String[] args) {
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", 0.39, 0.055, 0));
        planets.add(new Planet("Venus", 0.72, 0.815, 0));
        planets.add(new Planet("Earth", 1.0, 1.0, 1));
        planets.add(new Planet("Mars", 1.52, 0.107, 2));
        planets.add(new Planet("Jupiter", 5.2, 318, 79));
        planets.add(new Planet("Saturn", 9.58, 95, 83));
        planets.add(new Planet("Uranus", 19.22, 14, 27));
        planets.add(new Planet("Neptune", 30.05, 17, 14));
        System.out.println("Planets in Solar system - ");
        for (Planet e : planets) {
            System.out.println(e);
        }

        Comparator<Planet> ComparatorByDisnance = new Comparator<Planet>() {

            @Override
            public int compare(Planet o1, Planet o2) {

                return Double.compare(o1.getDistanceToTheSun(), o2.getDistanceToTheSun());
            }
        };
        planets.sort(ComparatorByDisnance);
        System.out.println("====== Sort by distance =================");
        for (Planet e : planets) {
            System.out.println(e);
        }


        Comparator<Planet> ComparatorByName = new Comparator<Planet>() {

            @Override
            public int compare(Planet o1, Planet o2) {

                return o1.getName().compareTo(o2.getName());
            }
        };
        planets.sort(ComparatorByName);
        System.out.println("====== Sort by name =================");
        for (Planet e1 : planets) {
            System.out.println(e1);
        }


        Comparator<Planet> ComparatorByMass = new Comparator<Planet>() {

            @Override
            public int compare(Planet o1, Planet o2) {

                return Double.compare(o1.getMass(), o2.getMass());
            }
        };
        planets.sort(ComparatorByMass);
        System.out.println("====== Sort by mass =================");
        for (Planet e : planets) {
            System.out.println(e);
        }

        Comparator<Planet> ComparatorBySatelit = new Comparator<Planet>() {

            @Override
            public int compare(Planet o1, Planet o2) {

                return Integer.compare(o1.getNumberOfSatelites(), o2.getNumberOfSatelites());
            }
        };
        planets.sort(ComparatorBySatelit);
        System.out.println("====== Sort by number satelites =================");
        for (Planet e : planets) {
            System.out.println(e);
        }
    }

}

