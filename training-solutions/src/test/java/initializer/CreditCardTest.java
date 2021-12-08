package initializer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void paymentTest() {
        CreditCard c = new CreditCard(1000);

        assertTrue(c.payment(500,Currency.EUR));
        assertEquals(1000, c.getBalance());
    }
}