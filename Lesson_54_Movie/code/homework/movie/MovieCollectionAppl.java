package homework.movie;

import homework.movie.dao.MovieCollection;
import homework.movie.dao.MovieCollectionImpl;
import homework.movie.model.Movie;

import java.time.LocalDate;

public class MovieCollectionAppl {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println();
        MovieCollection movieCollection = new MovieCollectionImpl();
        movieCollection.addMovie(new Movie(1, "GameOfThrones", "Weiss", "Fantasy", now.minusYears(10)));
        movieCollection.addMovie(new Movie(2,"HouseOfLies", "Hopkins","Drama",now.minusYears(11)));
        movieCollection.addMovie(new Movie(3,"Ojingeo geim", "Dong-hyeok","Thriller",now.minusYears(2)));
        movieCollection.addMovie(new Movie(4,"Platoon", "Stone","Military",now.minusYears(37)));
        movieCollection.addMovie(new Movie(5,"Titanic", "Cameron","Romance",now.minusYears(26)));

        for (Object d: movieCollection) { // print
            System.out.println(d);

        }

        System.out.println("==============================================");
        System.out.println("Films produced in the last 5 years: ");
        Iterable<Movie> res = movieCollection.findMoviesCreatedBetweenDates(now.minusYears(5),now.minusYears(0));

        for (Movie p : res) {
            System.out.println(p);
        }






    }
}
