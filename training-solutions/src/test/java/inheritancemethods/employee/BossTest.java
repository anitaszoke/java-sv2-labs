package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void createBossTest() {
        Boss boss = new Boss("Hum Bug", "Humbugfalva", 1000,10);

        assertEquals("Hum Bug", boss.getName());
        assertEquals("Humbugfalva", boss.getAddress());
        assertEquals(10, boss.getNumberOfEmployees());
        assertEquals(2000, boss.getSalary());

        assertEquals("Ivo", boss.migrate("Ivo"));
    }
}