package formatlocaleprintf;

import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> helloNames = Arrays.asList("Sára","Örs","Alma","Málna");

        for (String s : helloNames) {
            System.out.printf("Kedves %s! Örölünk, hogy termékünket választotta!",s);
            System.out.println();

        }
    }
}
