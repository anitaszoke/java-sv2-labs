package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    @Test
    void createMan(){
        List<RegisterDate> registerDatesMan = new ArrayList<>();
        RegisterDate registerDate = new RegisterDate("A születési ideje: ", LocalDate.of(1982,10,10));
        registerDatesMan.add(registerDate);
        Man m = new Man("Sebors Örs", registerDatesMan);


        assertEquals(1, m.getRegisterDates().size());
        assertEquals("Sebors Örs", m.getName());
        assertEquals(LocalDate.of(1982,10,10), m.getRegisterDates().get(0).getDate());
    }
}