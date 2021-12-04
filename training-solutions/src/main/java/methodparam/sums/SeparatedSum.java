package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

    public SumNumber sum(String filename) {
        double positive = 0;
        double negative = 0;
        String[] numbers = stringModification(filename);
        for (String s : numbers) {
            double number = Double.parseDouble(s);
            if (s.contains("-")) {
                negative += number;
            } else {
                positive += number;
            }
        }
        return new SumNumber(positive, negative);
    }

    private String readFile(String filename) {
        try {
            List<String> floatingNumbers = Files.readAllLines(Paths.get("src/main/resources/"+ filename));
            return floatingNumbers.get(0);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file");
        }
    }

    private String[] stringModification(String filename) {
        String floatingNumbers = readFile(filename);
        String[] numbers = floatingNumbers.replace(',', '.').split(";");

        return numbers;
    }
}
