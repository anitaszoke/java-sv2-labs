package genericsusage.withgenerics;

import genericsusage.Book;
import genericsusage.withoutgenerics.Library;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Book book = new Book("Csipkerózsikák");
    Book bookTwo = new Book("Élet 3.0");
    List<Book> books = Arrays.asList(book, bookTwo);


    Library library = new Library();

    @Test
    void createBook() {
        assertEquals("Csipkerózsikák", library.getFirstBook(books).getTitle());
    }
}