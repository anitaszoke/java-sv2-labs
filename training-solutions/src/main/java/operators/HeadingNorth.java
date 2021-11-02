package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections() {
        int count = 0;
        int degrees = 0;
        for (int i = 10; degrees < 360; i = i + 10) {
            degrees += i;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }
}
