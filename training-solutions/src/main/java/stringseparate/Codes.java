package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {
    List<String> codes = Arrays.asList("Y56","35P","ztr9","98vls","Prt58");
    StringBuilder stringBuilder = new StringBuilder();

    public void getCodesStartWithLetter(List<String> codes) {
        for (int i = 0; i < codes.size(); i++) {
            char letter = codes.get(i).toLowerCase().charAt(0);
            if (letter >= 'a' && letter <= 'z') {
                stringBuilder.append(codes.get(i));
                if (i != (codes.size())-1) {
                    stringBuilder.append(", ");
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Codes codes = new Codes();
        codes.getCodesStartWithLetter(codes.codes);

    }
}
