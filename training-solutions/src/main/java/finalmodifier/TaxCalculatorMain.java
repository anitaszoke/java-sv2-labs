package finalmodifier;

public class TaxCalculatorMain {

    public static void main(String[] args) {
        System.out.println("Áfa összege: "+ new TaxCalculator().tax(100));
        System.out.println("Bruttó összeg: "+ new TaxCalculator().priceWithTax(100));
    }
}
