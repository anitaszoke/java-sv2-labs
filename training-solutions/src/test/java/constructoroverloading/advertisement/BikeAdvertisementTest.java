package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    @Test
    void bikeAdvertisementCreateTwo() {
        BikeAdvertisement bike = new BikeAdvertisement("piros összecsukható, 8,67 kg", 79_900);

        assertEquals("piros összecsukható, 8,67 kg", bike.getShortText());
        assertEquals(79_900, bike.getPrice());
    }

    @Test
    void bikeAdvertisementCreateThree() {
        BikeAdvertisement bike = new BikeAdvertisement("piros összecsukható, 8,67 kg", 79_900, "Mali Folding");

        assertEquals("piros összecsukható, 8,67 kg", bike.getShortText());
        assertEquals(79_900, bike.getPrice());
        assertEquals("Mali Folding", bike.getBrand());
    }

    @Test
    void bikeAdvertisementCreateFour() {
        List<String> extras = Arrays.asList("bőrönd", "világítás szett");
        BikeAdvertisement bike = new BikeAdvertisement("piros összecsukható, 8,67 kg", 79_900, "Mali Folding", extras);

        assertEquals("piros összecsukható, 8,67 kg", bike.getShortText());
        assertEquals(79_900, bike.getPrice());
        assertEquals("Mali Folding", bike.getBrand());
        assertEquals("bőrönd", bike.getExtras().get(0));
    }

    @Test
    void bikeAdvertisementCreateFive() {
        List<String> extras = Arrays.asList("bőrönd", "világítás szett");
        BikeAdvertisement bike = new BikeAdvertisement("piros összecsukható, 8,67 kg", 79_900, "Mali Folding", extras, "MF-14");

        assertEquals("piros összecsukható, 8,67 kg", bike.getShortText());
        assertEquals(79_900, bike.getPrice());
        assertEquals("Mali Folding", bike.getBrand());
        assertEquals("bőrönd", bike.getExtras().get(0));
        assertEquals("MF-14", bike.getSerialNumber());
    }
}