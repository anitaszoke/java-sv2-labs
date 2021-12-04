package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void getMarriedTest() {
        List<RegisterDate> registerDates = new ArrayList<>();
        RegisterDate registerDate = new RegisterDate("A születési ideje: ", LocalDate.of(1985, 02, 21));
        registerDates.add(registerDate);
        Woman w = new Woman("Kiss Zonga", registerDates);

        List<RegisterDate> registerDatesMan = new ArrayList<>();
        RegisterDate registerDate1 = new RegisterDate("A születési ideje: ", LocalDate.of(1982, 10, 10));
        RegisterDate registerDate2 = new RegisterDate("A házzaságkötés ideje: ", LocalDate.of(2010, 05, 23));
        registerDatesMan.add(registerDate1);
        registerDatesMan.add(registerDate2);
        Man m = new Man("Sebors Örs", registerDatesMan);

        Marriage marriage = new Marriage();
        marriage.getMarried(w, m);

        assertEquals("Sebors-Kiss Zonga", w.getName());
        assertEquals(3, m.getRegisterDates().size());
    }
}