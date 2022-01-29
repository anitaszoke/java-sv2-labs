package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void grossLoadTest() {
        Vehicle vehicle = new Vehicle(1000);
        int people = Vehicle.PERSON_AVERAGE_WEIGHT;
        assertEquals(1000 + people, vehicle.getGrossLoad());
    }
}