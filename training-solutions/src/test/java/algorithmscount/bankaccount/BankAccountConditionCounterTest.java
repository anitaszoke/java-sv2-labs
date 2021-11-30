package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountConditionCounterTest {
    BankAccountConditionCounter bankAccountConditionCounter = new BankAccountConditionCounter();

    @Test
    void countWithBalanceGreaterThanTest() {
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new BankAccount("József", "2589-9632", 600));
        bankAccountList.add(new BankAccount("Sára", "2589-9639", 400));
        bankAccountList.add(new BankAccount("Örs", "2589-9634", 500));
        bankAccountList.add(new BankAccount("János", "2589-9636", 550));

        assertEquals(2, bankAccountConditionCounter.countWithBalanceGreaterThan(bankAccountList, 525));
        assertEquals(3, bankAccountConditionCounter.countWithBalanceGreaterThan(bankAccountList, 500));
    }
}