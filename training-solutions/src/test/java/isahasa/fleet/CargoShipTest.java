package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoShipTest {

    @Test
    void loadTest() {
        CargoShip cargoShip = new CargoShip(10);

        assertEquals(0, cargoShip.getCargoWeight());

        cargoShip.loadCargo(5);

        assertEquals(5, cargoShip.getCargoWeight());

    }

    @Test
    void loadRemainderTest() {
        CargoShip cargoShip = new CargoShip(10);

        int remainder = cargoShip.loadCargo(15);

        assertEquals(5, remainder);

        assertEquals(10, cargoShip.getCargoWeight());
    }
}