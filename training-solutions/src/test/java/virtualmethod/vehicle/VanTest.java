package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VanTest {

    @Test
    void grossLoadTest() {
        Van van = new Van(2000,2,1500);
        int people = 3 * Van.PERSON_AVERAGE_WEIGHT;

        assertEquals(2000+1500+people,van.getGrossLoad());
    }
}