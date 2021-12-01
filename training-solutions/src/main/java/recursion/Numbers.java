package recursion;

import java.util.Arrays;

public class Numbers {

    public int getSum(int[] numbers) {
        int n = numbers.length;
        if (n > 1) {
            int[] result = Arrays.copyOfRange(numbers, 1, n);
            return numbers[0] + getSum(result);
        } else if (n == 1) {
            return numbers[0];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(new Numbers().getSum(numbers));
    }
}