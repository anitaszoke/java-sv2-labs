package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumNumberTest {

    @Test
    void createSumNumber() {
        SumNumber sn = new SumNumber(25.5,-14.6);

        assertEquals(-14.6,sn.getNegative(),0.0005);
        assertEquals(25.5,sn.getPositive(),0.0005);
    }
}