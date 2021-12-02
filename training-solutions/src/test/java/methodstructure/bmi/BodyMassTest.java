package methodstructure.bmi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {
    BodyMass bodyMass;

    @Test
    void getterBodyMassTest() {
        BodyMass bodyMass = new BodyMass(65.5,1.75);
        assertEquals(65.5,bodyMass.getWeight());
        assertEquals(1.75,bodyMass.getHeight());
    }

    @Test
    void getBodyMassIndexTest() {
        BodyMass bodyMass = new BodyMass(65.5,1.75);
        assertEquals(21.38,bodyMass.getBodyMassIndex(),0.5);
    }

    @Test
    void getBodyTest() {
        BodyMass bodyMassNormal = new BodyMass(65.5,1.75);
        BodyMass bodyMassOver = new BodyMass(80.5,1.75);
        BodyMass bodyMassUnder = new BodyMass(50.5,1.75);

        assertEquals(BmiCategory.NORMAL, bodyMassNormal.getBody());
        assertEquals(BmiCategory.OVERWEIGHT, bodyMassOver.getBody());
        assertEquals(BmiCategory.UNDERWEIGHT, bodyMassUnder.getBody());
    }

    @Test
    void isThinnerThanTest() {
        BodyMass bodyMassOver = new BodyMass(80.5,1.75);
        BodyMass bodyMassUnder = new BodyMass(50.5,1.75);

        assertTrue(bodyMassUnder.isThinnerThan(bodyMassOver));
        assertFalse(bodyMassOver.isThinnerThan(bodyMassUnder));
    }
}