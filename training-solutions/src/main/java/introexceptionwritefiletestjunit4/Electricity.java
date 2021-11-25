package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    public void writeStreets(Path path) {
        List<String> streets = streetAdd();
        try {
            Files.write(path, streets);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }

    private List<String> streetAdd() {
        List<String> streets = new ArrayList<>();
        streets.add(LocalDate.now().toString());
        streets.add("József Attila utca");
        streets.add("Derék utca");
        streets.add("Kaszap utca");
        streets.add("Csengettyű köz");
        return streets;
    }
}
