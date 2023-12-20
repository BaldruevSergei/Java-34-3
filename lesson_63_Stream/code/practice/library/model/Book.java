package practice.library.model;
//Практика - приложение **Library.**
//
//Создать классы:
//- Book: author, name, issueYear

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private String author; // автор
    private String name; // имя
    private Integer issueYear; // год выпуска
    private List<Review> reviews; // отзывы


    public Book(String author, String name, Integer issueYear) {
        this.author = author;
        this.name = name;
        this.issueYear = issueYear;
        this.reviews = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Integer getIssueYear() {
        return issueYear;
    }

    public List<Review> getReviews() {
        return reviews;
    }
    public void addReview(Review review) {
        reviews.add(review);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(issueYear, book.issueYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, issueYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", issueYear=" + issueYear +
                ", reviews " +reviews +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.getAuthor());
    }
}
