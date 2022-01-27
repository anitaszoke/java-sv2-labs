package interfacedependencyinversion.amount;

public class BankAtm implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        if (amount%1000 == 0) {
            return amount;
        } else {
            amount = ((amount / 1000) + 1) * 1000;
        }
        return amount;
    }
}
