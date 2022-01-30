package exceptionclass.bank;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number cant be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100_000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double amount) {
        if (amount > this.maxSubtract || amount <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        double finalBalance = this.balance - amount;
        if (finalBalance < 0) {
            throw new LowBalanceBankOperationException("Low balance!");
        }

        this.balance = finalBalance;
        return this.balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.balance += amount;
        return this.balance;
    }

}