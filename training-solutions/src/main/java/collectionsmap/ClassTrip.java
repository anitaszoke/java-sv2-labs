package collectionsmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> nameWithPayments = new HashMap<>();

    public Map<String, Integer> getNameWithPayments() {
        return new HashMap<>(nameWithPayments);
    }

    public void loadInpayments(Path path) {
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)));
            while ((line = reader.readLine()) != null) {
                splitLines(line);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    private void splitLines(String line) {
        String[] splitLine = line.split(": ");

        nameWithPayments.put(splitLine[0],Integer.parseInt(splitLine[1]));
    }

    public static void main(String[] args) {
        ClassTrip classTrip = new ClassTrip();
        classTrip.loadInpayments(Paths.get("src/test/resources/inpayments.txt"));
        System.out.println(classTrip.getNameWithPayments());
    }
}
