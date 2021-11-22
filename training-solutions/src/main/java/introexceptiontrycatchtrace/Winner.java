package introexceptiontrycatchtrace;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> names = Arrays.asList("Ádám", "Kata", null, "Sári", "Pityu", null, "Mária", "Zoli", "Laci", "Gabi", "Hajni");

    public String getWinner() {
        Random random = new Random();
        int winner = random.nextInt(names.size());
        String winName = names.get(winner);
        return winName.toUpperCase();
    }
}