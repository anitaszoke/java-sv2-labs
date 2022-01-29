package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FleetTest {

    Fleet fleet = new Fleet();

    CargoShip cargoShip = new CargoShip(100);

    FerryBoat ferryBoat = new FerryBoat(1000, 50);

    Liner liner = new Liner(50);

    @Test
    void loadAll() {
        fleet.addShip(cargoShip);
        fleet.addShip(ferryBoat);
        fleet.addShip(liner);

        fleet.loadShip(100, 1100);

        assertEquals(0, fleet.getWaitingCargo());
        assertEquals(0, fleet.getWaitingPeople());

        assertEquals(100, cargoShip.getCargoWeight());
    }

    @Test
    void loadAllAndWaiting() {
        fleet.addShip(cargoShip);
        fleet.addShip(ferryBoat);
        fleet.addShip(liner);

        fleet.loadShip(110, 1110);

        assertEquals(10, fleet.getWaitingCargo());
        assertEquals(10, fleet.getWaitingPeople());

        assertEquals(100, cargoShip.getCargoWeight());
    }
}