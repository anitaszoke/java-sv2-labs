package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextInt()) {
            String result = "";
            int number = scanner.nextInt();
            if (number > 100) {
                stringBuilder.append(number);
                stringBuilder.append(",");
            }

        }
        String result = stringBuilder.toString();
        if (result.length() > 0) {
            return result.substring(0 , result.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();

        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
    }
}
