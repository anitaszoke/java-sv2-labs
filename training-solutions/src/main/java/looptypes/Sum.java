package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public void printSums(int [] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers[i]+numbers[i+1]);
        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int [] numberList = {2, 6, 3, 5, 7, 9};
        sum.printSums(numberList);
    }
}


