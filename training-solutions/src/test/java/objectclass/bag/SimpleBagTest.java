package objectclass.bag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {

    @Test
    void createSimpleBag() {
        SimpleBag sb = new SimpleBag();

        sb.putItem(new Book("King", "It"));
        Beer beer = new Beer("Pilsner", 300);
        sb.putItem(beer);

        assertEquals(2, sb.size());
        assertFalse(sb.isEmpty());
        assertTrue(sb.contains(beer));
    }
}