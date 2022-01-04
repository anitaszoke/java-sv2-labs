package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void nextTest() {

        assertEquals(SeatHeaterState.OFF, SeatHeaterState.ONE.next());
        assertEquals(SeatHeaterState.ONE, SeatHeaterState.TWO.next());
        assertEquals(SeatHeaterState.TWO, SeatHeaterState.THREE.next());
        assertEquals(SeatHeaterState.THREE, SeatHeaterState.OFF.next());
    }

}