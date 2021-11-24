package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        try {
            List<String> poem = new Poem().readPoem();
            String firstLetter = new Poem().poemFirst(poem);
            System.out.println(firstLetter);
        } catch (IllegalStateException ise) {
            ise.getCause().printStackTrace();
        }
    }

    private List<String> readPoem() {
        try {
            return Files.readAllLines(Paths.get("poem.txt"));
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }
    }

    private String poemFirst(List<String> poem) {
        StringBuilder firstLetter = new StringBuilder();
        for (String s : poem) {
            firstLetter.append(s.charAt(0));
        }
        return firstLetter.toString();
    }
}
