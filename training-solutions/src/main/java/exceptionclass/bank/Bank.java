package exceptionclass.bank;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list cant be empty!");
        }
        this.accounts = accounts;
    }

    public void decreaseBalance(String accountNumber, double amount) {
        Account account = find(accountNumber);
        account.subtract(amount);
    }

    private Account find(String accountNumber) {
        Account account = accounts.get(0);
        int found = 0;
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                account = a;
                found++;
            }
        }
            if (found == 0) {
                throw new InvalidAccountNumberBankOperationException("Invalid account number!");
            }

        return account;
    }

    public void increaseBalance(String accountNumber, double amount) {
        Account account = find(accountNumber);
        account.deposit(amount);
    }

    public void addAccount (Account account) {
        accounts.add(account);
    }
}