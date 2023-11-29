package homework.movie.dao;

import java.time.LocalDate;
import java.util.Iterator;

public interface MovieCollection <Movie> extends Iterable<Movie>{

    // добавить фильм
    boolean addMovie(Movie movie);

    boolean addMovie(homework.movie.model.Movie movie);

    // удалить фильм по imdb
    Movie removeMovie (long imdb);

    // найти фильм по imdb
    Movie findById (long imdb);

    // найти  фильм по genre
    Iterable<Movie> findByGenre (String genre);

    // найти  фильм по director
    Iterable<Movie> findByDirector (String director);

    // найти  фильм по дате изготовления
    Iterable<Movie> findMoviesCreatedBetweenDates (LocalDate from, LocalDate to);



    int totalQuantity();


    Iterator<Movie> iterator();
}
