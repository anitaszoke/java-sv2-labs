package interfacedefaultmethods.demo;

import java.time.LocalDateTime;

public interface Audited {

    LocalDateTime getCreatedAt();
//kötelező a default ha implementációt akarunk megadni a metódusnak
    default boolean createdAfter(LocalDateTime dateTime) {
        return getCreatedAt().isAfter(dateTime);
    }
}

