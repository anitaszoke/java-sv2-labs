package finalmodifier;

public class TaxCalculator {
    public static final double AFA = 27;

    public double priceWithTax(double price) {
        return price * (AFA / 100 + 1 );
    }

    public double tax (double price) {
        return price * (AFA / 100 );
    }

}
