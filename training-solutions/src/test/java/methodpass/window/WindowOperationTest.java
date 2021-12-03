package methodpass.window;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void riseSize1() {
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("konyha",130,160));
        windows.add(new Window("nappali",140,180));

        WindowOperation w = new WindowOperation();
        w.riseSize1(windows, 15);

        assertEquals(175,windows.get(0).getHeight());
    }

    @Test
    void riseSize() {
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("konyha",130,160));
        windows.add(new Window("nappali",140,180));

        WindowOperation w = new WindowOperation();
        w.riseSize(windows, 15);

        assertEquals(195,windows.get(1).getHeight());
    }
}