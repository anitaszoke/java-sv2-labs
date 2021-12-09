package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    @Test
    void createShippedBookTest() {
        ShippedBook shippedBook = new ShippedBook("Az", 4000, 2000);

        assertEquals("Az", shippedBook.getTitle());
        assertEquals(4000, shippedBook.price);
        assertEquals(2000, shippedBook.getShippingCost());

        assertEquals(10_000, shippedBook.order(2));
        assertEquals("Az: 4000 Ft, postaköltség: 2000 Ft", shippedBook.toString());
    }
}