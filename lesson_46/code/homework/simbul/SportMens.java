package homework.simbul;

import java.util.Objects;

public class SportMens implements  Comparable<SportMens> {


        String lastName;
        String firstName;
        int registrationNumber;
        String club;
        double resultInSeconds;

        // Конструктор


    public SportMens(String lastName, String firstName, int registrationNumber, String club, double resultInSeconds) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.registrationNumber = registrationNumber;
        this.club = club;
        this.resultInSeconds = resultInSeconds;
    }

    @Override
    public String toString() {
        return "SportMens{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", club='" + club + '\'' +
                ", resultInSeconds=" + resultInSeconds +
                '}';
    }

    // Метод для вывода информации о спортсмене
        public void displayInfo() {
            System.out.println(lastName + " " + firstName + " (Номер: " + registrationNumber + ", Клуб: " + club + ") - " + resultInSeconds + " сек");
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportMens sportMens = (SportMens) o;
        return registrationNumber == sportMens.registrationNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }

    @Override
    public int compareTo(SportMens o) {
        return 0;
    }

    // @Override
    //public int compareTo(SportMens o) {
      //  int res = this.resultInSeconds.com
        //return 0;
   // }
}






