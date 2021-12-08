package initializer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CreditCard {
    private long balance;
    private Currency currency;
    private static final List<Rate> RATES = new ArrayList<>();


    public CreditCard(long balance) {
        this.balance = balance;
    }

    public CreditCard(long balance, Currency currency) {
        getUpToDateCurrency(RATES);
        this.balance = balance;
        this.currency = currency;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        double pay = amount * exchangeCurrency(currency);
        if (balance >= pay) {
            balance -= pay;
            return true;
        } else {
            return false;
        }
    }

    private double exchangeCurrency(Currency currency) {
        for (Rate r : RATES) {
            if (r.getCurrency() == currency) {
                return r.getConversionFactor();
            }
        }
        return 0.0;
    }
// feltölteni vgyis fájlbeolvasásra átírni?
    private void getUpToDateCurrency(List<Rate> rates) {
        rates.add(new Rate(Currency.CHF, 352.77));
        rates.add(new Rate(Currency.EUR, 367.40));
        rates.add(new Rate(Currency.GBP, 431.44));
        rates.add(new Rate(Currency.USD, 325.72));
        rates.add(new Rate(Currency.HUF, 1));
    }
}
