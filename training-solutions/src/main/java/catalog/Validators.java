package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String s) {
        return (s == null || s.isBlank() || "".equals(s));
    }

    public static boolean isEmpty(List l) {
        return (l == null || l.isEmpty() || l.size() == 0);
    }
}