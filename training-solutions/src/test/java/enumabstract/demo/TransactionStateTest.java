package enumabstract.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionStateTest {

    @Test
    void isCompletedTest() {
        HasTransactionState hasTransactionState = TransactionState.PENDING;

        assertFalse(hasTransactionState.isCompleted());

        assertFalse(TransactionState.PENDING.isCompleted());
    }
}