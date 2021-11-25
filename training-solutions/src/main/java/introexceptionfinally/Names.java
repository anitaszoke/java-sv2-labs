package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        Names names = new Names();
        System.out.println(names.nameDr(Paths.get("drnames.txt")));
        System.out.println(names.nameDr(Paths.get("nodrnames.txt")));
        System.out.println(names.nameDr(Paths.get("nodrnamess.txt")));
    }

    private String nameDr(Path path) {

        for (String name : readNames(path)) {
            if (name.startsWith("dr")) {
                return name;
            }
        }
        return " ";
    }

    private List<String> readNames(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        } finally {
            System.out.println("End of reading.");
        }
    }
}

