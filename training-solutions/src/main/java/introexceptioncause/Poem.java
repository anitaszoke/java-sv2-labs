package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        try {
            new Poem().readPoem();
        } catch (IllegalStateException ise) {
            ise.getCause().printStackTrace();
        }
    }

    private void readPoem() {
        List<String> poem;
        try {
            poem = Files.readAllLines(Paths.get("poem.txt"));
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }
        System.out.println(poemFirst(poem));
    }

    private String poemFirst(List<String> poem) {
        StringBuilder firstLetter = new StringBuilder();
        for (String s : poem) {
            firstLetter.append(s.charAt(0));
        }
        return firstLetter.toString();
    }
}