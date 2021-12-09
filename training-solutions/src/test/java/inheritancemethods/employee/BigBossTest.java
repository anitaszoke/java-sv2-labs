package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    @Test
    void createBigBossTest() {
        BigBoss bigBoss = new BigBoss("Hum Bug", "Humbugfalva", 1000, 100, 10_000);

        assertEquals("Hum Bug", bigBoss.getName());
        assertEquals("Humbugfalva", bigBoss.getAddress());
        assertEquals(100, bigBoss.getNumberOfEmployees());
        assertEquals(10_000, bigBoss.getBonus());

        assertEquals(21_000, bigBoss.getSalary());
    }
}