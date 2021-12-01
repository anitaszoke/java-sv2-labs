package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String title;
    private final LocalDate date;
    private final String number;

    public Monument(String name, String title, LocalDate date, String number) {
        if (isEmpty(name) || isEmpty(title) || isEmpty(number))
            throw new IllegalArgumentException("Data can not be empty or null!");
        this.name = name;
        this.title = title;
        this.date = date;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }

    private boolean isEmpty(String text) {
        return text == null || text.isBlank();
    }
}
