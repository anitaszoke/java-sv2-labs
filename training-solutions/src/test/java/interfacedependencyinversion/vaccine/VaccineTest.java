package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {

    Vaccine vaccine;
    List<Person> registrated;

    @BeforeEach
    void setUp() {
        registrated = new ArrayList<>();
        registrated.add(new Person("Kiss József", 45, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Nagy Eleonóra", 35, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Szép Virág", 65, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Németh Béla", 72, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Gárdos Géza", 25, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Szabó Veronika", 32, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Vedres Károly", 53, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Ökrös Gizella", 33, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Fekete Dávid", 62, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Bíró Rita", 29, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Baráth Zita", 58, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Kovács Tamás", 42, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Török István", 81, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Fehér Ágnes", 34, ChronicDisease.YES, Pregnancy.YES));
        registrated.add(new Person("Bánkuti Bendegúz", 93, ChronicDisease.YES, Pregnancy.NO));
    }

    @Test
    void firstVaccineTest() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(registrated);

        assertEquals(15, vaccine.getVaccinationList().size());
        assertEquals("Nagy Eleonóra", vaccine.getVaccinationList().get(0).getName());
        assertEquals("Bíró Rita", vaccine.getVaccinationList().get(12).getName());
    }

    @Test
    void secondVaccineTest() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(registrated);

        assertEquals(7, vaccine.getVaccinationList().size());
        assertEquals("Kiss József", vaccine.getVaccinationList().get(0).getName());
        assertEquals("Török István", vaccine.getVaccinationList().get(6).getName());
    }
}