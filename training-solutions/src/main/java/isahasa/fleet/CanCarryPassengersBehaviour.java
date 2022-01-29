package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {

    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int notLoad = 0;
        if (passengers > maxPassengers) {
            notLoad = passengers - maxPassengers;
            this.passengers = passengers - notLoad;
        } else {
            this.passengers = passengers;
        }
        return notLoad;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}