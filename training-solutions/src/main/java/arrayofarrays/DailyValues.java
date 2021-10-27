package arrayofarrays;

public class DailyValues {
    int [][] values = new int[12][];
    int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void getValues() {
        for (int i = 0; i < days.length; i++) {
            values[i] = new int[days[i]];
        }

    }
    public void printArrays(int[][] values) {
        for (int itemA[] : values) {
            for (int itemAoA : itemA)
                System.out.print(itemAoA);
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        dailyValues.getValues();
        dailyValues.printArrays(dailyValues.values);

    }
}
