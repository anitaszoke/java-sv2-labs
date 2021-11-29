package algorithmssum.salespersons;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAmountSumCalculatorTest {

    @Test
    void sumSalesAmountTest() {
        SalesAmountSumCalculator sum = new SalesAmountSumCalculator();

        List<Salesperson> salespersonList = new ArrayList<>();
        salespersonList.add(new Salesperson("István", 800_000));
        salespersonList.add(new Salesperson("Sára", 900_000));
        salespersonList.add(new Salesperson("Péter", 600_000));

        assertEquals(2_300_000,sum.sumSalesAmount(salespersonList));
    }
}
