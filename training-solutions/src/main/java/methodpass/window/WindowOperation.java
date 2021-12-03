package methodpass.window;

import java.util.ArrayList;
import java.util.List;

public class WindowOperation {

    //új lista, eredeti nem változik
    public void riseSize1(List<Window> windows, int plusSize) {
        List<Window> risedWindow = new ArrayList<>();
        int riseWindowHeight = 0;
        for (Window window : windows) {
            riseWindowHeight = window.getHeight() + plusSize;
            window.setHeight(riseWindowHeight);
            risedWindow.add(window);
        }
    }

    //az eredeti lista változik
    public void riseSize(List<Window> windows, int plusSize) {
        int riseWindowHeight = 0;
        for (Window window : windows) {
            riseWindowHeight = window.getHeight() + plusSize;
            window.setHeight(riseWindowHeight);
        }
    }
}