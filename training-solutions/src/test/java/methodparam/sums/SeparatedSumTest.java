package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void sum() {
        SeparatedSum ss = new SeparatedSum();
        SumNumber sumNumber = ss.sum("floatingnumbers.txt");

        assertEquals(110.6,sumNumber.getPositive(),0.0005);
        assertEquals(-153.3,sumNumber.getNegative(),0.0005);
    }
}