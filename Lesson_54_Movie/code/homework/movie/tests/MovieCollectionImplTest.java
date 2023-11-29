package homework.movie.tests;

import homework.movie.dao.MovieCollection;
import homework.movie.dao.MovieCollectionImpl;
import homework.movie.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionImplTest {
    MovieCollection movieCollection;
    static final LocalDate now = LocalDate.now();


    @BeforeEach
    void setUp() {
        movieCollection = new MovieCollectionImpl(List.of(
                new Movie(1,"GameOfThrones", "Weiss","Fantasy",now.minusYears(10)),
                new Movie(2,"HouseOfLies", "Hopkins","Drama",now.minusYears(11)),
                new Movie(3,"Ojingeo geim", "Dong-hyeok","Thriller",now.minusYears(2)),
                new Movie(4,"Platoon", "Stone","Military",now.minusYears(37)),
                new Movie(5,"Titanic", "Cameron","Romance",now.minusYears(26))
        ));
    }

    @Test
    void addMovie() {
        assertFalse(movieCollection.addMovie(null));
        assertFalse(movieCollection.addMovie(new Movie(2,"HouseOfLies", "Hopkins","Drama",now.minusYears(11))));
        assertEquals(5, movieCollection.totalQuantity());
        assertTrue(movieCollection.addMovie(new Movie(105, "T4", "G4", "D3", now.minusYears(5))));
        assertEquals(6, movieCollection.totalQuantity());
    }

    @Test
    void removeMovie() {
        assertNull(movieCollection.removeMovie(6));
        assertEquals(5,movieCollection.totalQuantity());
        assertNotNull(movieCollection.removeMovie(4));
        assertEquals(4,movieCollection.totalQuantity());



    }

    @Test
    void findById() {
        Movie movie = (Movie) movieCollection.findById(1);
        assertNotNull(movie);
        assertEquals("GameOfThrones",movie.getTitle());
        assertNull(movieCollection.findById(6));

    }

    @Test
    void findByGenre() {
        Iterable<Movie> movies = movieCollection.findByGenre("Fantasy");
        int count = 0;
        for (Movie movie : movies) {
            assertEquals("Fantasy", movie.getGenre());
            count++;
        }
        assertEquals(1, count);


        }





    @Test
    void findByDirector() {
        Iterable<Movie> movies = movieCollection.findByDirector("Hopkins");
        int count = 0;
        for (Movie movie : movies) {
            assertEquals("Hopkins", movie.getDirector());
            count++;
        }
        assertEquals(1,count);

    }

    @Test
    void findMoviesCreatedBetweenDates() {
        LocalDate  startDate = LocalDate.now().minusYears(20);
        LocalDate endDate = LocalDate.now().minusYears(5);
        Iterable<Movie> movies = movieCollection.findMoviesCreatedBetweenDates(startDate, endDate);
        int count  = 0;
        for (Movie movie: movies) {
            assertTrue(movie.getDate().isAfter(startDate) || movie.getDate().isEqual(startDate));
            assertTrue(movie.getDate().isBefore(endDate) || movie.getDate().isEqual(endDate));
            count++;
        }
        assertEquals(2,count);


        }



    @Test
    void totalQuantity() {
        assertEquals(5,movieCollection.totalQuantity());
    }

    @Test
    void iterator() {
        int count = 0;
        for (Object movie : movieCollection) {
            assertNotNull(movie);
            count++;
        }
        assertEquals(5,count);
    }
}