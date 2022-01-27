package interfacedefaultmethods.longword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public interface FileOperations {

    default List<String> readFromFile(Path path) {
        List<String> read = new ArrayList<>();

        try {
            read = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return read;
    }

    String getLongWord();
}
