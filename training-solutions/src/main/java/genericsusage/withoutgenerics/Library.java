package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {
    private List books;

    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("Books cant be null");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Books cant be empty");
        }
        Object o = books.get(0);

        if (!(o instanceof Book)) {
            throw new ClassCastException("Not a book");
        }
        return (Book) o;
    }
}
