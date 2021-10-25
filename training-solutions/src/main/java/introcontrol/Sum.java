package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek öt számot!");
        int sum = 0;

        for (int number = 0; number < 5; number = number +1) {
            int answer = scanner.nextInt();
            sum = sum + answer;

        }
        System.out.println("Sum: "+ sum);
    }
}
