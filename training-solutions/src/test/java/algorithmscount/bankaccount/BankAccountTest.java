package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    void createBankAccount() {
        BankAccount bankAccount = new BankAccount("Alma", "5569-8895", 500);
        assertEquals("Alma", bankAccount.getNameOfOwner());
        assertEquals("5569-8895", bankAccount.getAccountNumber());
        assertEquals(500, bankAccount.getBalance());
    }
}