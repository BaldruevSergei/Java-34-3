package homework.planet;

import java.util.Objects;

public class Planet {
    // fields
    protected String name;
    protected double distanceToTheSun;
    protected double mass;
    protected int numberOfSatelites;

    //constr
    public Planet(String name, double distanceToTheSun, double mass, int numberOfSatelites) {
        this.name = name;
        this.distanceToTheSun = distanceToTheSun;
        this.mass = mass;
        this.numberOfSatelites = numberOfSatelites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumberOfSatelites() {
        return numberOfSatelites;
    }

    public void setNumberOfSatelites(int numberOfSatelites) {
        this.numberOfSatelites = numberOfSatelites;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceToTheSun=" + distanceToTheSun +
                ", mass=" + mass +
                ", numberOfSatelites=" + numberOfSatelites +
                '}';
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Double.compare(distanceToTheSun, planet.distanceToTheSun) == 0 && Double.compare(mass, planet.mass) == 0 && numberOfSatelites == planet.numberOfSatelites && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceToTheSun, mass, numberOfSatelites);
    }
}
