package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();

    private int waitingPeople;

    private int waitingCargo;

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight) {
        int people = passengers;
        int cargos = cargoWeight;

        for (Ship ship : ships) {
            if (ship instanceof CanCarryPassengers) {
                if (people != 0) {
                    people = ((CanCarryPassengers) ship).loadPassenger(people);
                }
            }

            if (ship instanceof CanCarryGoods) {
                if (cargos != 0) {
                    cargos = ((CanCarryGoods) ship).loadCargo(cargos);
                }
            }
        }
        waitingPeople = people;
        waitingCargo = cargos;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
