package introexceptionthrow;

public class Validation {
    public void validateName(String name) {
            for (char c : name.toCharArray()) {
                if (Character.isDigit(c)) {
                    throw new IllegalArgumentException("A név nem tartalmazhat számokat");
                }
            }
            if (name == null || name.length() == 0) {
                throw new IllegalArgumentException("Nem adott meg nevet");
        }
    }

    public void validateAge(String ageString) {
        if (ageString.length() < 1) {
            throw new IllegalArgumentException("Nem adott meg életkort");
        }
        for (char c : ageString.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Az életkor csak számokat tartalmazhat");
            }
        }
        if (120 < Integer.parseInt(ageString) || Integer.parseInt(ageString) == 0) {
            throw new IllegalArgumentException("Az életkornak 0 és 120 között kell lennie");
        }
    }

}
