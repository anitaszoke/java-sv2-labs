package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void createBook(){
        Book book = new Book("Az", 4000);

        assertEquals("Az", book.getTitle());
        assertEquals(4000,book.price);
    }

    @Test
    void purchase() {
        Book book = new Book("Az", 4000);

        assertEquals(8000, book.purchase(2));

    }
}