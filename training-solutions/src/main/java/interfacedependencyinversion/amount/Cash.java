package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        if (amount % 5 == 0) {
            return amount;
        } else if (amount % 5 <=2) {
            amount -= amount % 5;
        } else {
            amount += (5 - (amount % 5));
        }
        return amount;
    }
}
