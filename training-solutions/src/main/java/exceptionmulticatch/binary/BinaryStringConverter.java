package exceptionmulticatch.binary;

import java.util.Arrays;


public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String text) {
        if (text == null || text.isBlank()) {
            throw new NullPointerException("Text is null!");
        }
        boolean[] data = new boolean[text.length()];

        char[] charArray = text.toCharArray();
        int charArrayLength = charArray.length;
        for (int i = 0; i < charArrayLength; i++) {
            char c = charArray[i];
            if (c != '0' && c != '1')
                throw new IllegalArgumentException("Not valid string!");
            data[i] = c == '1';
        }
        return data;
    }

    public String booleanArrayToBinaryString(boolean[] value) {
        if (value == null) {
            throw new NullPointerException("Value array is null!");
        }
        if (value.length == 0) {
            throw new NullPointerException("Value array is empty!");
        }

        StringBuilder sb = new StringBuilder();
        for (boolean b : value) {
            sb.append(b ? "1" : "0");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BinaryStringConverter bsc = new BinaryStringConverter();

        System.out.println(Arrays.toString(bsc.binaryStringToBooleanArray("01")));
        System.out.println(bsc.booleanArrayToBinaryString(new boolean[] {false,true}));
    }
}
