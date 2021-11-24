package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {
    public static void main(String[] args) {
        try {
            new PaulStreetBoys().readNames();
        } catch (IllegalStateException ise) {
            ise.getCause().printStackTrace();
        }
    }

    private void readNames() {
        List<String> boys;
        try {
            boys = Files.readAllLines(Paths.get("palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not find file", ioe);
        }
        names(boys);
    }

    private void names(List<String> boys) {
        for (String boy : boys) {
            if (boy.equals("Nemecsek Ernő")) {
                System.out.println(boy.toLowerCase());
            } else {
                System.out.println(boy);
            }
        }
    }
}
