package homework.movie.dao;

import homework.movie.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieCollectionImpl implements MovieCollection{
    // поле для хранения объекта типа List
    private List<Movie> moviesList; // список фильмов

    // конструктор
    public MovieCollectionImpl() {
        moviesList = new ArrayList<>(); // делаем этот List уже конкретным ArrayList
    }

    // заполняем ArrayList объектами из списка фильмов List<Movie> movies, который подаем на вход
    public MovieCollectionImpl (List<Movie> movies){
        this();
        for (Movie m : movies) {
            //moviesList.add(m);
            addMovie(m); // вызываем метод из класса
        }
    }

    @Override
    public boolean addMovie(Object o) {
        return false;
    }

    @Override
    public boolean addMovie(Movie movie) {
        // null не добавляем
        if(movie == null){
            return false;
        }
        // нельзя добавить фильм с таким же imdb
       // if (findById(movie.getImdb()) != null){
        //    return false;
        // }
        // или еще можно так
        if(moviesList.contains(movie)) {
            return false;
        }
        // добавляем фильм
        moviesList.add(movie);
        return true;
    }

    @Override
    public Movie removeMovie(long imdb) {
        Movie victim = findById(imdb);
        if (victim != null) {
            moviesList.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Movie findById(long imdb) {
        // в moviesList надо найти элемент, у которого совпадает imdb с искомым
        for (Movie m : moviesList) {
            if(m.getImdb() == imdb) {
                return m;
            }
        }
        return null;
    }

    @Override
    public Iterable<Movie> findByGenre(String genre) {
        List<Movie> foundByGenre = new ArrayList<>();
        for (Movie m : moviesList) {
            if (m.getGenre().equals(genre)) {
                foundByGenre.add(m);
            }
        }
        return foundByGenre;
    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
       List<Movie> foundByDirector = new ArrayList<>();
        for (Movie m : moviesList) {
            if (m.getDirector().equals(director)) {
                foundByDirector.add(m);

            }
            // по аналогии с findByGenre

        }return foundByDirector;

    }

    @Override
    public Iterable findMoviesCreatedBetweenDates(LocalDate from, LocalDate to) {
        List<Movie> foundMovies = new ArrayList<>();
        for (Movie movie : moviesList) { // Перебор фильмов
            LocalDate movieDate = movie.getDate();//извлекаем дату фильма

            // Проверка даты фильма по диапазону дат
            if ((movieDate.isEqual(from) || movieDate.isAfter(from)) && movieDate.isBefore(to)) {
                foundMovies.add(movie);// Добавление фильма
            }
        }
        return foundMovies;// Возврат списка фильмов
    }







    @Override
    public int totalQuantity() {
        return moviesList.size();
    }

    @Override
    public Iterator<Movie> iterator() {
        return moviesList.iterator();
    }
}
