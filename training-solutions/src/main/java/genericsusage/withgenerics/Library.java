package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException("Books cant be null");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Books cant be empty");
        }
        return books.get(0);
    }
}
