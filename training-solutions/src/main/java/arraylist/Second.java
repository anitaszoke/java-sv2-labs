package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(3);
        number.add(9);
        number.add(42);
        number.add(67);
        number.add(4);
        number.add(0);
        number.add(76);
        number.add(14);
        number.add(84);
        number.add(35);
        number.add(92);

        System.out.println(number);
        System.out.println(number.size());

        for (int i = 1; i < number.size(); i = i + 2) {
            int second = number.get(i);
            System.out.println(second);
        }
    }
}
