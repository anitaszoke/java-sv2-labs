package staticattrmeth.bank;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    private long transactionValue;

    public BankTransaction(long transactionValue) {
        if (transactionValue < MIN_TRANSACTION_VALUE || transactionValue > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Transaction value must be between 0 and 10_000_000");
        }
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        if (transactionValue < currentMinValue) {
            currentMinValue = transactionValue;
        }
        if (transactionValue > currentMaxValue) {
            currentMaxValue = transactionValue;
        }
    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMaxValue = MIN_TRANSACTION_VALUE;
        currentMinValue = MAX_TRANSACTION_VALUE;

    }

    public static long getAverageOfTransaction() {
        return countOfTransactions == 0 ? 0 : Math.round((double) sumOfTransactions / countOfTransactions);

    }

    public static long getCurrentMinValue() {
        return countOfTransactions == 0 ? 0 : currentMinValue;

    }

    public static long getCurrentMaxValue() {
        return countOfTransactions == 0 ? 0 : currentMaxValue;

    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;

    }

    public long getTransactionValue() {
        return transactionValue;

    }
}