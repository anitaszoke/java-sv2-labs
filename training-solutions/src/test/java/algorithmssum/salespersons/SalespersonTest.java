package algorithmssum.salespersons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SalespersonTest {

    @Test
    void createSalespersonTest() {
        Salesperson salesperson = new Salesperson("Mónika", 500_000);
        assertEquals("Mónika", salesperson.getName());
        assertEquals(500_000, salesperson.getAmount());
    }
}
