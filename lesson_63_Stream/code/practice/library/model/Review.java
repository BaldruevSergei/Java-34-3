package practice.library.model;

public class Review {
    private int rating; // оценка от 1 до 5
    private String text; // текст отзыва
    private int likes; // количество лайков
    private String reviewer; // имя читателя, написавшего отзыв

    public Review(int rating, String text) {
        this.rating = rating;
        this.text = text;
        this.likes = 0;
    }

    public int getRating() {
        return rating;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public void addLike() {
        likes++;
    }

    public String getReviewer() {
        return reviewer;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rating=" + rating +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                ", reviwer = " + reviewer +
                '}';
    }
}


