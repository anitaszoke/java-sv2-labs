package algorithmssum;

public class TwoDigitEvens {
    public int getSum() {
        int sum = 0;
        for (int i = 10; i <=99; i++) {
            if (i%2 !=0 && i%5 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        TwoDigitEvens twoDigitEvens = new TwoDigitEvens();
        System.out.println(twoDigitEvens.getSum());
    }
}
