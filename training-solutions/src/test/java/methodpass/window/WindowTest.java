package methodpass.window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowTest {

    @Test
    void windowCreate() {
        Window w = new Window("konyha",130,160);

        assertEquals("konyha",w.getRoomName());
        assertEquals(130,w.getWidth());
        assertEquals(160,w.getHeight());
    }
}