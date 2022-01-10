package genericsusage.withoutgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Book book = new Book("Csipkerózsikák");
    Book bookTwo = new Book("Élet 3.0");
    List Book = Arrays.asList(book, bookTwo);


    Library library = new Library();

    @Test
    void createBook() {
        assertEquals("Csipkerózsikák", library.getFirstBook(Book).getTitle());
    }

    @Test
    void nullExceptionTest() {
        Exception ex = assertThrows(NullPointerException.class, () -> new Library().getFirstBook(null));
        assertEquals("Books cant be null", ex.getMessage());

    }

    @Test
    void emptyExceptionTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Library().getFirstBook(Arrays.asList()));
        assertEquals("Books cant be empty", ex.getMessage());
    }

    @Test
    void objectExceptionTest() {
        Exception ex = assertThrows(ClassCastException.class, () -> new Library().getFirstBook(Arrays.asList("ajtó", "ablak")));
        assertEquals("Not a book", ex.getMessage());
    }
}