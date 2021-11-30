package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin (List<Integer> temperature) {
        int min = temperature.get(0);
        for (int t : temperature) {
            if (t < min) {
                min = t;
            }
        }
        return min;
    }
}