package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> people, int fewerPeople) {
        for (int i : people) {
            if (i < fewerPeople) {
                return true;
            }
        }
        return false;
    }
}