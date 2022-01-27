package enumabstract.webshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {

    @Test
    void orderStateTest() {
        Deletable delivered = OrderState.DELIVERED;
        Deletable aNew = OrderState.NEW;

        assertFalse(delivered.canDelete());
        assertTrue(aNew.canDelete());
    }
}