package conversions;

public class TooBigNumber {
    public long getRightResult(int number) {
        long number1 = 2_147_483_647;
        long result = number1 + number;
        return result;

    }

    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.getRightResult(2));
    }
}
