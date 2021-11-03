package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {

        List<String> iceCreamList = Arrays.asList("csoki","vanília","eper","citrom","puncs");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iceCreamList.size(); i++) {
             if (i != 0) {
                 sb.append(", ");
             }
             sb.append(iceCreamList.get(i));
        }
        System.out.println("Ma kapható: "+ sb.toString() + ". Gyerekeknek féláron!");
    }
}

