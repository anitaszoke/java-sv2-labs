package introecxeptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        try {
            List<String> neptunCode = new Neptun().readNeptunCode();
            System.out.println(neptunCode);
        } catch (IOException ioe) {
            System.out.println("Can not find file");
            ioe.printStackTrace();
        }
    }

    private List<String> readNeptunCode() throws IOException {
        List<String> neptunCodeWithName = Files.readAllLines(Paths.get("neptun.csv"));
        List<String> neptunCode = new ArrayList<>();
        for (int i = 0; neptunCodeWithName.size() > i; i++) {
            int index = neptunCodeWithName.get(i).indexOf(",");
            neptunCode.add(neptunCodeWithName.get(i).substring(index + 1));
        }
        return neptunCode;
    }
}