package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> letters = readFromFile(path);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < letters.size(); i++) {
            if (i < letters.size() - 1) {
                sb.append(letters.get(i).charAt(0));
            } else {
                sb.append(letters.get(i));
            }
        }
        return sb.toString();
    }
}
