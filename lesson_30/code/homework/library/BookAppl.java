package homework.library;

import homework.library.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book[] bk = new Book[4];
        bk[0] = new Book(1001l,"O'Genri","New-York", 1889);
        bk[1] = new Book(1002l,"А.И.Лажечников","Басурман", 1835);
        bk[2] = new Book(1003l,"Э.Сетон-Томпсон","Мустанг-Иноходец", 1931);
        bk[3] = new Book(2003L,"O'Genri", "Дары Волхов", 1899);

    }

    private static double averageYear(Book[] bk) {
        int year = 0;
        for (int i = 0; i < bk.length; i++) {
            year += bk[i].getYearOfPublishing();
        }
        return (double) year / bk.length;
    }


}
