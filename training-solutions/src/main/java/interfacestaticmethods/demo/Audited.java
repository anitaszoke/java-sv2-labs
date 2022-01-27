package interfacestaticmethods.demo;

import java.time.LocalDateTime;
import java.util.List;

public interface Audited {

    LocalDateTime getCreatedAt();

    //legkésőbb létrehozott
    static Audited findLastCreated(List<Audited> values) {
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        Audited last = values.get(0);
        for (Audited actual : values) {
            if (actual.getCreatedAt().isAfter(last.getCreatedAt())) {
                last = actual;
            }
        }
        return last;

    }

}
