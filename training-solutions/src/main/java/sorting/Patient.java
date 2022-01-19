package sorting;

import java.time.LocalDateTime;

public class Patient {

    private String name;
    private String taj;
    private LocalDateTime time;

    public Patient(String name, String taj, LocalDateTime time) {
        this.name = name;
        this.taj = taj;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTaj() {
        return taj;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
