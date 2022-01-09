package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {
    List<String> getFullNames(String lastName, Path path) {
        List<String> fullNames = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String names = lastName + " " + scanner.nextLine();
                fullNames.add(names);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return fullNames;
    }
}