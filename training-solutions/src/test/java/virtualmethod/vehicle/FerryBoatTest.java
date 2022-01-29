package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {

    @Test
    void grossLoadTest() {
        FerryBoat ferryBoat = new FerryBoat(3000);
        Car car = new Car(1500,0);
        ferryBoat.load(car);

        assertEquals(3000 + FerryBoat.PERSON_AVERAGE_WEIGHT+car.getGrossLoad(),ferryBoat.getGrossLoad());
    }

    @Test
    void loadFailed() {
        FerryBoat ferryBoat = new FerryBoat(3000);
        Car car = new Car(2100,0);
        ferryBoat.load(car);

        assertFalse(ferryBoat.load(car));
    }

    @Test
    void canCarryTest() {
        FerryBoat ferryBoat = new FerryBoat(3000);
        Car car = new Car(2100,0);
        Car anotherCar = new Car(1924,0);

        assertTrue(ferryBoat.canCarry(anotherCar));
        assertFalse(ferryBoat.canCarry(car));
    }

}