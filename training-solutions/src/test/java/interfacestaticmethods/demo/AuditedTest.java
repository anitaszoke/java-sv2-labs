package interfacestaticmethods.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuditedTest {

    @Test
    void findTest(){
        List<Audited> values = new ArrayList<>();
        values.add(new Employee("John Doe", LocalDateTime.of(2019,1,1,10,0)));
        values.add(new Employee("Jane Doe", LocalDateTime.of(2019,2,1,10,0)));

        Audited audited = Audited.findLastCreated(values);
// nem tudom róla, hogy ő kicsoda, ezért típuskényszerítés kell ((Employee)audited)
        assertEquals("Jane Doe",((Employee)audited).getName());
    }
}