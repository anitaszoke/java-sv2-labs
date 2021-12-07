package staticattrmeth.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    @Test
    void bankTransactionExceptionTest() {
        BankTransaction.initTheDay();
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> new BankTransaction(11_000_000));
        assertEquals("Transaction value must be between 0 and 10_000_000", ex.getMessage());
    }

    @Test
    void bankTransactionTest() {
        BankTransaction.initTheDay();
        new BankTransaction(500);

        assertEquals(500, BankTransaction.getCurrentMinValue());
        assertEquals(500, BankTransaction.getCurrentMaxValue());
        assertEquals(500, BankTransaction.getSumOfTransactions());
        assertEquals(500, BankTransaction.getAverageOfTransaction());
    }

    @Test
    void bankTransactionMoreTest() {
        BankTransaction.initTheDay();
        new BankTransaction(500);
        new BankTransaction(1500);

        assertEquals(500, BankTransaction.getCurrentMinValue());
        assertEquals(1500, BankTransaction.getCurrentMaxValue());
        assertEquals(2000, BankTransaction.getSumOfTransactions());
        assertEquals(1000, BankTransaction.getAverageOfTransaction());
    }
}