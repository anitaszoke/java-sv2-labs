package interfacedefaultmethods.demo;

import java.time.LocalDateTime;

public class Account implements Audited, CreatedAtJanuary{

    private LocalDateTime localDateTime;

    public Account(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return localDateTime;
    }
//névütközés feloldása, override, majd hívhatjuk a metódusban az interface metódusát
    @Override
    public boolean createdAfter(LocalDateTime dateTime) {
        //return Audited.super.createdAfter(dateTime);
        return CreatedAtJanuary.super.createdAfter(dateTime);
    }
}
