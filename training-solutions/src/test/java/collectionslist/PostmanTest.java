package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {
    Postman pm;

    @BeforeEach
    void createAddress() {
        pm = new Postman();
        pm.addAddress("Derék utca 120");
        pm.addAddress("Derék utca 12");
        pm.addAddress("Derék utca 120");
        pm.addAddress("Derék utca 1");
    }

    @Test
    void removeAddressTest() {

        assertEquals("Derék utca 120",pm.getAddresses().get(0));
        assertEquals("Derék utca 120",pm.getAddresses().get(2));
        assertEquals(4,pm.getAddresses().size());

        pm.removeAddress("Derék utca 120");

        assertEquals(3,pm.getAddresses().size());
        assertEquals("Derék utca 120",pm.getAddresses().get(1));
    }
}