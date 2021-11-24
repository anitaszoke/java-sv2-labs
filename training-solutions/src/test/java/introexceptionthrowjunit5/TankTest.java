package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TankTest {

    Tank tank = new Tank();

    @Test
    void testModifyAngleInvalid() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(90));
        assertEquals("Turret can not reach position!", iae.getMessage());
    }
}