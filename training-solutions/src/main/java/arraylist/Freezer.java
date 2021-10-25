package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("alma");
        shoppingList.add("sajt");
        shoppingList.add("kenyér");
        shoppingList.add("vaj");
        shoppingList.add("sonka");

        System.out.println(shoppingList);
        System.out.println(shoppingList.size());

        shoppingList.remove("alma");
        shoppingList.remove("vaj");

        System.out.println(shoppingList);
        System.out.println(shoppingList.size());
    }
}
