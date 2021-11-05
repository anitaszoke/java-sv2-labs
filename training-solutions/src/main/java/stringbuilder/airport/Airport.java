package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        System.out.println("Törölt járatok: ");
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getStatus() == Status.DELETED) {
                System.out.println(flights.get(i).getFlightNumber());

            }
        }
        return null;
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        Flight flight = new Flight("AB-945", Status.ACTIVE);
        Flight flight1 = new Flight("ABC-945", Status.DELETED);
        Flight flight2 = new Flight("ABCD-945", Status.DELETED);
        airport.addFlight(flight);
        airport.addFlight(flight1);
        airport.addFlight(flight2);

        airport.getDeletedFlights();
    }
}