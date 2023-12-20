package practice.library.model;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        double averageRating1 = book1.getReviews().stream()
                .mapToDouble(Review::getRating)
                .average()
                .orElse(0);

        double averageRating2 = book2.getReviews().stream()
                .mapToDouble(Review::getRating)
                .average()
                .orElse(0);

        // Sort in descending order based on average rating
        return Double.compare(averageRating2, averageRating1);
    }



}
