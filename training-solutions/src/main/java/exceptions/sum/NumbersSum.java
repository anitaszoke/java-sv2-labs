package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Can't be null!");
        }
        return sumNumbers(numbers);
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Can't be null!");
        }
        try {
            stringToNumber(numbers);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Invalid number");
        }
        return sumNumbers(stringToNumber(numbers));
    }

    private int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    private int[] stringToNumber(String[] numbers) {
        int[] stringNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            stringNumber[i] = Integer.parseInt(numbers[i]);
        }
        return stringNumber;
    }
}
