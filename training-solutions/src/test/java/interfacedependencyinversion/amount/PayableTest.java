package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void amountTest() {
        Payable payable = new Amount();

        assertEquals(99, payable.getPayableAmount(99));
    }

    @Test
    void cashTest() {
        Payable payable = new Cash();

        assertEquals(100,payable.getPayableAmount(99));
        assertEquals(100,payable.getPayableAmount(98));
        assertEquals(100,payable.getPayableAmount(101));
        assertEquals(100,payable.getPayableAmount(102));
        assertEquals(105,payable.getPayableAmount(103));
        assertEquals(105,payable.getPayableAmount(107));
        assertEquals(100,payable.getPayableAmount(100));
    }

    @Test
    void bankAtmTest() {
        Payable payable = new BankAtm();

        assertEquals(1000,payable.getPayableAmount(99));
        assertEquals(1000,payable.getPayableAmount(999));
        assertEquals(1000,payable.getPayableAmount(1));
    }

}