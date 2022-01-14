package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    ClassTrip classTrip = new ClassTrip();

    @Test
    void loadInpayments() {

        classTrip.loadInpayments(Paths.get("src/test/resources/inpayments.txt"));

        assertEquals(3, classTrip.getNameWithPayments().entrySet().size());
        assertEquals(12500, classTrip.getNameWithPayments().get("Kiss József"));
        assertTrue(classTrip.getNameWithPayments().containsKey("Szép Virág"));

    }

    @Test
    void loadInpaymentsException() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> classTrip.loadInpayments(Paths.get("wrong.txt")));
        assertEquals("Cannot read file", ex.getMessage());
    }

}