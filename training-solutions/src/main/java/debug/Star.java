package debug;

public class Star {
    public void writeStars(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                printStars(numbers[i]);
                System.out.println();
            } else {
                int prev = numbers[i-1];
                int stars = numbers[i] - prev;
                printStars(stars);
                System.out.println();
            }
        }
    }

    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

        public static void main(String[] args){        {
            Star star = new Star();
            int[] numberList = {2, 4, 6, 8, 10};
            star.writeStars(numberList);

        }
    }
}
