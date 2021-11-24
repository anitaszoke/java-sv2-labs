package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        try {
            List<String> things = Files.readAllLines(Paths.get("holiday.txt"));
            System.out.println(things);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Can not read file");
        }
    }
}
