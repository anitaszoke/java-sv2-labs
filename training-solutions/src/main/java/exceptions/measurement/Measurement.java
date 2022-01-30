package exceptions.measurement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    List<String> measurements = new ArrayList<>();

    public List<String> readFromFile(Path path) {
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)))) {
            while ((line = reader.readLine()) != null) {
                measurements.add(line);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }
        return measurements;
    }

    public List<String> validate(List<String> measurements) {
        List<String> wrongLines = new ArrayList<>();
        for (String line : measurements) {
            if (!validateAll(line)) {
                wrongLines.add(line);
            }
        }
        return wrongLines;
    }

    private boolean validateAll(String line) {
        String[] lineSplit = line.split(",");

        try {
            return validateLine(lineSplit) &&
                    validateNumber(lineSplit) &&
                    validateName(lineSplit[2]);
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    private boolean validateLine(String[] lineSplit) {
        return lineSplit.length == 3;
    }

    private boolean validateNumber(String[] lineSplit) {
        try {
            Integer.parseInt(lineSplit[0]);
            Double.parseDouble(lineSplit[1]);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validateName(String name) {
        String[] nameParts = name.split(" ");
        return nameParts.length >= 2;
    }
}