package sorting;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedicalSurgeryTest {

    @Test
    void getPatientTimeOrderTest() {
        MedicalSurgery medical;
        List<Patient> patients = Arrays.asList(new Patient("Alma","987",LocalDateTime.of(2022,1,19,19,0)),
                new Patient("Málna","654",LocalDateTime.of(2022,1,19,14,15)),
                new Patient("Cirmi","321",LocalDateTime.of(2022,1,19,15,30)));

        medical = new MedicalSurgery(patients);

        assertEquals("654",medical.getPatientsInTimeOrder().get(0).getTaj());
        assertEquals("321",medical.getPatientsInTimeOrder().get(1).getTaj());
        assertEquals("987",medical.getPatientsInTimeOrder().get(2).getTaj());

    }

}