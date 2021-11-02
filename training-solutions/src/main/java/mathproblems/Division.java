package mathproblems;

public class Division {
    public void getDivisors(int number) {
        for (int i = 1; i <= number; i = i + 1) {
            if (number%i == 0) {
                System.out.println(number + " osztója: "+ i);
            }
        }
    }

    public void getRightNumbers(int[] numbers) {
        for (int i = 1; i < numbers.length; i ++) {
            if (numbers[i]%i == 0) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(12);

        division.getRightNumbers(new int[]{1, 1, 3, 10, 4 ,5, 5});
    }
}
