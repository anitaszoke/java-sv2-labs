package introecxeptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {
    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("underground.txt"));
    }

    public String getDailySchedule(List<String> listAllLines) {
        StringBuilder startWithTwo = new StringBuilder();
        for (String listAllLine : listAllLines) {
            if (listAllLine.startsWith("2")) {
                startWithTwo.append(listAllLine).append(" ");
            }
        }
        return LocalDate.now() + ", " + startWithTwo;
    }
}