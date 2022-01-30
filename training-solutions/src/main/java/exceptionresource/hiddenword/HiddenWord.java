package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        StringBuilder word = new StringBuilder();
        try (Scanner scanner = new Scanner((path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                word.append(getHiddenWord(line));
            }
        } catch (IOException ioe) {

            throw new IllegalStateException("Invalid number", ioe);

        }
        return word.toString();
    }

    private String getHiddenWord(String line) {
        for (char c : line.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return String.valueOf(c);

            }
        }
        return " ";
    }
}