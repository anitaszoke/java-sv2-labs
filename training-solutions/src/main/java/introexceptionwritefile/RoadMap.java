package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {

        List<String> cityList = Arrays.asList("Kondoros", "Kardos", "Csabacsű", "Szarvas");
        try {
            Files.write(Paths.get("roadmap.txt"), cityList);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
