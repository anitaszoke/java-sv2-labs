package numbers;

public class Percent {
    public double getValue(int number1, int number2) {
        double result = number1 / 100 * number2;
        return result;
    }

    public double getBase(int number1, int number2) {
        double result = number1 / number2 *100;
        return result;
    }

    public double getPercent(int number1, int number2) {
        double result = 100 / (number1 / number2);
        return result;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(100,30));
        System.out.println(percent.getBase(60,30));
        System.out.println(percent.getPercent(60,30));
    }
}
