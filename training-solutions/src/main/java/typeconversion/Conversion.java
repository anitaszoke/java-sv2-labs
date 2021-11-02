package typeconversion;

import java.util.Arrays;

public class Conversion {
    public double convertToDouble(double number) {
        int intNumber = (int)number;
        double doubleNumber = (double)intNumber;
        return doubleNumber;
    }

    public byte[] convertIntArrayToByteArray(int[] number) {
        byte[] byteArray = new byte[number.length];

        for (int i = 0; i < number.length; i++) {
            if ((number[i]) >= 0 && number[i] <= 127) {
                byteArray[i] = (byte) number[i];
            } else {
                byteArray[i] = -1;
            }
        }
        return byteArray;
    }

    public int getFirstDecimal(double number) {
        return (int)((number - (int) number) * 10);
    }

}
