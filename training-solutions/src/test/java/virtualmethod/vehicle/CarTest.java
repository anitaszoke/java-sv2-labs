package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void grossLoadTest() {
        Car car = new Car(1600, 4);
        int people = (5 * car.PERSON_AVERAGE_WEIGHT);

        assertEquals((people + 1600), car.getGrossLoad());
    }

}