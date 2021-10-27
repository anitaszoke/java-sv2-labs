package arrays;

import java.util.Arrays;

public class ArraysMain {
    public void numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(Arrays.toString(numberOfDays));
    }

    public void multiplicationTableAsString(int size){
        int[][] tableXY = new int[size][size];
        for (int x = 1; x < size; x++) {
            for (int y = 1; y < size; y++) {
                tableXY[x][y] = (x)*(y);
            }
        }
        System.out.println(Arrays.deepToString(tableXY));
    }

    public void sameTempValues(double[] day, double[] anotherDay) {
        double [] dayOne = Arrays.copyOfRange(day, 0, day.length);
        double [] dayTwo = Arrays.copyOfRange(anotherDay, 0, anotherDay.length);
        System.out.println(Arrays.equals(dayOne, dayTwo));
    }

    public void sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int shorterDay = shorterDay(day.length, anotherDay.length);
        double[] day1 = Arrays.copyOfRange(day, 0, shorterDay);
        double[] day2 = Arrays.copyOfRange(anotherDay, 0, shorterDay);
        System.out.println(Arrays.equals(day1, day2));
    }

   public int shorterDay(int day1, int day2){
        if (day1 < day2) {
            return day1;
        } else {
            return day2;
        }
    }

    public void wonLottery(int[] myNumbers, int[]winnerNumbers){
        int[] myNumbersNew = Arrays.copyOfRange(myNumbers, 0, myNumbers.length);
        int[] winnerNumbersNew = Arrays.copyOfRange(winnerNumbers, 0, winnerNumbers.length);
        Arrays.sort(myNumbersNew);
        Arrays.sort(winnerNumbersNew);
        System.out.println(Arrays.toString(myNumbersNew));
        System.out.println(Arrays.toString(winnerNumbersNew));
        System.out.println(Arrays.equals(myNumbersNew, winnerNumbersNew));
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        arraysMain.numberOfDaysAsString();

        arraysMain.multiplicationTableAsString(4);

        arraysMain.sameTempValues(new double[]{2,4,6,8}, new double[]{2,4,6,8});
        arraysMain.sameTempValues(new double[]{2,4,6,8}, new double[]{2,4,7,8});

        arraysMain.sameTempValuesDaylight(new double[]{2,4,6,8}, new double[]{2,4,6,8,10});
        arraysMain.sameTempValuesDaylight(new double[]{2,4,6,8}, new double[]{2,4,7,8,10});

        arraysMain.wonLottery(new int[] {5, 10, 15, 20, 25}, new int[]{90, 75, 5, 1, 10});

    }
}
