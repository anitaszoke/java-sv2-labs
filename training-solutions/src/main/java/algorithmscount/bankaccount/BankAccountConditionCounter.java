package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccount, int minBalance) {
        int count = 0;
        for (BankAccount bankAcc : bankAccount) {
            if (bankAcc.getBalance() >= minBalance) {
                count++;
            }
        }
        return count;
    }
}