package homework.country;
//Задача 2. Создайте класс Country со следующими полями:
//
//название;
//население(в млн.);
//континент. Создайте связный список, содержащий 11 стран из разных континентов. Получите списки этих стран, отсортированные по:
//алфавиту;
//по размеру населения в стандартном и обратном порядках;
//принадлежности континенту и размеру населения в порядке от большего к меньшему.
import java.util.Comparator;
import java.util.Objects;

public class Country implements Comparator {
     String name;
     double population;
     String continent;

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Double.compare(population, country.population) == 0 && Objects.equals(name, country.name) && Objects.equals(continent, country.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, continent);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }

    public void print() {

    }
}
