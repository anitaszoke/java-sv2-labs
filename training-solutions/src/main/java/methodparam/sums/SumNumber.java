package methodparam.sums;

public class SumNumber {
    private double positive;
    private double negative;

    public SumNumber(double positive, double negative) {
        this.positive = positive;
        this.negative = negative;
    }

    public double getPositive() {
        return positive;
    }

    public double getNegative() {
        return negative;
    }

    public void setPositive(double positive) {
        this.positive = positive;
    }

    public void setNegative(double negative) {
        this.negative = negative;
    }
}