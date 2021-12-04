package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    @Test
    void createWoman(){
        List<RegisterDate> registerDates = new ArrayList<>();
        RegisterDate registerDate = new RegisterDate("A születési ideje: ", LocalDate.of(1985,02,21));
        registerDates.add(registerDate);
        Woman w = new Woman("Kiss Zonga", registerDates);


        assertEquals(1, w.getRegisterDates().size());
        assertEquals("Kiss Zonga", w.getName());
        assertEquals(LocalDate.of(1985,02,21), w.getRegisterDates().get(0).getDate());
    }

}