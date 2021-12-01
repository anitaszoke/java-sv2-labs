package immutable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void createCar() {
        Car car = new Car("KIA", "Rio", 2015);

        assertEquals("KIA", car.getBrand());
        assertEquals("Rio", car.getModel());
        assertEquals(2015, car.getYearOfProduction());
    }

    @Test
    void createCarEmpty() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Car("", "Lancer", 2017));
        assertEquals("Brand name is empty!", ex.getMessage());
    }

    @Test
    void createCarNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Car(null, "Lancer", 2017));
        assertEquals("Brand name is empty!", ex.getMessage());
    }

    @Test
    void createCarFutureYear() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Car("KIA", "Rio", 2050));
        assertEquals("Year of production is not valid!", ex.getMessage());
    }
}