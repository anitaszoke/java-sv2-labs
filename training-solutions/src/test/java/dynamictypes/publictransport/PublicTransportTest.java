package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void createVehicles() {
        PublicVehicle bus = new Bus(20, 10, "bus");
        PublicVehicle tram = new Tram(1, 30, 3);
        PublicVehicle metro = new Metro(10, 40, 15);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getVehicleList().size());
    }
}