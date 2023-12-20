package practice.library;

import practice.library.model.*;

import java.util.*;
import java.util.stream.Collectors;

public class LibAppl {
    public static void main(String[] args) {

        Library library = new Library(); // заводим объект
        library.getBooks().forEach(System.out::println);

        System.out.println("------------- Activities -------------- ");
        library.getReaders().forEach(System.out::println);

        System.out.println("--------------- Books Unsorted ------------- ");
        library.getReaders().forEach(System.out::println);

        System.out.println("--------------- Books sorted ------------- "); // сортировка
        List<Book> listBooksByYearIssue = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList());
        listBooksByYearIssue.forEach(System.out::println);

        System.out.println("--------------- Mailing  List  All Users ------------- ");
        // без стрим
      /*  ArrayList<Email> emailList = new ArrayList<>(); // список для рассылки
        for (Reader reader : library.getReaders()) {  // в Library берем редерс
            emailList.add(new Email(reader.getEmail()));
        }
        for (Email email : emailList) {
            System.out.println(email);

        }*/

        // стрим
        List<Email> addresses = library.getReaders().stream()
                .map(Reader::getEmail) //
                .map(Email::new)
                .toList();
        addresses.forEach(System.out::println);

        System.out.println("--------------- Mailing  List Subscribed Users ------------- ");//        List<Email> addressesSubscribed = new ArrayList<>();
      /*  for (Reader reader : library.getReaders()){
            if (reader.isSubscriber() && reader.getBooks().size() >= 1)
               addressesSubscribed.add(new Email(reader.getEmail()));
       }
               addressesSubscribed.forEach(System.out::println);
    }*/
        List<Email>  addressesSubscribed = library.getReaders().stream()
                .filter(Reader::isSubscriber) //
                .filter(r -> r.getBooks().size()>=1) // данный читатель взял более одной книги
                .map(Reader::getEmail) // создаем элемент листа на новый
                .map(Email::new)
                .toList();

        addressesSubscribed.forEach(System.out::println);
        System.out.println("------------ List of Books------------------ ");
        /*Set<Book> rentedBook = new HashSet<>();
        for (Reader reader : library.getReaders()) {
            rentedBook.addAll(reader.getBooks());

        }
        rentedBook.forEach(System.out::println);*/
        List<Book> rentedBooks= library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .collect(Collectors.toList());
        rentedBooks.forEach(System.out::println);

        System.out.println("------------ Max books rented------------------ ");
      /*  int max =0;
        for (Reader reader : library.getReaders()) {
            if (reader.getBooks().size() > max){
                max = rentedBooks.size();
            }
        }
        System.out.println(max);*/
        Integer res = library.getReaders().stream()
                .map(reader -> reader.getBooks().size())
                //                 если   больше size то будет size иначе vfrc
                .reduce(0,(max,size) ->size > max ? size: max); // складываем все
        System.out.println(res);

        System.out.println("------------ List E- mail for user's group ------------------ ");
        // Соберем всех пользователей, которые взяли более 2-х книг в группу "TO_MUCH", остальных
        // в группу с ключем "OK"

        Map<String, List<Email>> result = new HashMap<>();
        for (Reader reader : library.getReaders()) {
            if (reader.isSubscriber()) {
                if (reader.getBooks().size() > 2) {
                    if (!result.containsKey("TOO_MUCH")) { // по этому ключу еще нет значений
                        result.put("TOO_MUCH", new ArrayList<>());
                    }
                    result.get("TOO_MUCH").add(new Email(reader.getEmail()));
                } else {
                    if (!result.containsKey("OK")) {// по этому ключу еще нет значений
                        result.put("OK", new ArrayList<>());
                    }
                    result.get("OK").add(new Email(reader.getEmail()));
                }
            }
        }
        // Print keys and values - проход по всем ключам и их значениям
        for (String key : result.keySet()) {
            System.out.println("key: " + key + " value: " + result.get(key));
        }

        System.out.println("---------------------------------------------------- ");
        System.out.println(result.entrySet());


        System.out.println("=====================================================");
        Map<String, List<Email>> map = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(Collectors.groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                        Collectors.mapping(r -> new Email(r.getEmail()), Collectors.toList())));
        System.out.println(map.entrySet());

        boolean check =  checkBook (library, "George Orwell");
        System.out.println("-------------------- Groups of Users III (from Yurii Koval) ----------------------------");
        Map<Integer, Reader> mapReader = library.getReaders().stream()
                .collect(Collectors.toMap(
                        reader -> reader.getBooks().size(),
                        reader -> reader
                ));

        System.out.println(mapReader.entrySet());

      /*  Map<Integer, Reader> mapReader = library.getReaders().stream()
                .collect(Collectors.toMap(
                        reader -> reader.getBooks().size(),
                        reader -> reader
                ));*/
        /*Задание 1. Библиотека решила собирать отзывы от своих читателей о прочитанных книгах. В отзыве о книге читатель:
        ставит оценку книге от 1 до 5 (1 - не понравилась, 5 - очень понравилась);
        пишет текстовый отзыв о прочитанной книге.
        Также читатели имеют возможность поставить лайк под отзывом другого читателя, который им понравился*/

        // вносим отзывы в book
        // Создаем отзывы и добавляем их к книгам
        Review review1 = new Review(4, "Nice book!");
        Review review2 = new Review(5, "Excellent!");
        Review review3 = new Review(5, "Excellent!");
        Review review4 = new Review(5, "Excellent!");
        Review review5 = new Review(3, "Ugly book");

        library.getBooks().get(0).addReview(review1);
        library.getBooks().get(0).addReview(review2);
        library.getBooks().get(1).addReview(review3);
        library.getBooks().get(1).addReview(review3);
        library.getBooks().get(1).addReview(review3);
        library.getBooks().get(1).addReview(review3);

        // Добавляем лайки к отзывам
        review1.addLike();  // Добавляем лайк к отзыву review1
        review2.addLike();  // Добавляем лайк к отзыву review2
        review3.addLike();  // Добавляем лайк к отзыву review3



        // список книг, отсортированный по их рейтингу;

        System.out.println("================= список книг, отсортированный по их рейтингу; ===================== ");
        List<Book> booksByRating = library.getBooks().stream()
                .sorted((book1, book2) -> {
                    double rating1 = book1.getReviews().stream().mapToDouble(Review::getRating).average().orElse(0);
                    double rating2 = book2.getReviews().stream().mapToDouble(Review::getRating).average().orElse(0);
                    return Double.compare(rating2, rating1); // Сравнение в обратном порядке (от большего к меньшему)
                })
                .collect(Collectors.toList());
        booksByRating.forEach(System.out::println);

        // список книг, отсортированный по количеству отзывов на них;
        List<Book> booksByReviewCount = library.getBooks().stream()
                .sorted(Comparator.comparingInt(book -> book.getReviews().size()))
                .collect(Collectors.toList());
        System.out.println("================Список книг, отсортированный по количеству отзывов на них;======================= ");
        booksByReviewCount.forEach(System.out::println);

        // Группировка отзывов по автору книги с учетом всех отзывов читателей
        ;
        Map<String, List<Review>> reviewsByAuthor = library.getBooks().stream()
                .flatMap(book -> book.getReviews().stream()
                        .map(review -> new AbstractMap.SimpleEntry<>(book.getAuthor(), review)))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
        System.out.println("===============Группировка отзывов по автору книги с учетом всех отзывов читателей==================== ");
        reviewsByAuthor.forEach((author, reviews) -> {
            System.out.println(author + ":");
            reviews.forEach(review -> {
                System.out.println("  Rating: " + review.getRating() +
                        ", Likes: " + review.getLikes() +
                        ", Text: \"" + review.getText() + "\"" +
                        ", Liked by: " + review.getLikes());
            });
            System.out.println();
        });

// Сортировка читателей-авторов отзывов по сумме лайков и вывод рейтинга, лайков и отзывов
        List<String> authorsByLikes = reviewsByAuthor.entrySet().stream()
                .sorted(Comparator.comparingInt(entry ->
                        entry.getValue().stream().mapToInt(Review::getLikes).sum()))
                .map(entry -> {
                    List<Review> reviews = entry.getValue();
                    int totalLikes = reviews.stream().mapToInt(Review::getLikes).sum();
                    double averageRating = reviews.stream().mapToDouble(Review::getRating).average().orElse(0.0);

                    String reviewDetails = reviews.stream()
                            .map(review ->
                                    String.format("Rating: %d, Likes: %d, Text: \"%s\", Liked by: %d",
                                            review.getRating(), review.getLikes(), review.getText(), review.getLikes()))
                            .collect(Collectors.joining(", "));

                    return String.format("Author: %s, Rating: %.2f, Likes: %d, Reviews: [%s]",
                            entry.getKey(), averageRating, totalLikes, reviewDetails);
                })
                .collect(Collectors.toList());

// Print the sorted list
        System.out.println("===================Cписок авторов отзывов, отсортированный по количеству лайков под их отзывами.==================");
        authorsByLikes.forEach(System.out::println);
    } // end off main

    private  static  boolean checkBook(Library library, String author){
        boolean match = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> author.equals(book.getAuthor()));
        return match;
    }

} // end of class

