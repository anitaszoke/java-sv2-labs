package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void createBicycleTest() {
        Vehicle vehicle = Vehicle.of(2);

        assertEquals(Bicycle.class, vehicle.getClass());
    }

    @Test
    void createCarTest() {
        Vehicle vehicle = Vehicle.of(4);

        assertEquals(Car.class, vehicle.getClass());
    }

    @Test
    void throwExceptionTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> Vehicle.of(1));
        assertEquals("Wrong numberOfWheels", ex.getMessage());
    }
}