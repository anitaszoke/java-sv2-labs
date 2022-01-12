package collectionslist;

import java.util.LinkedList;

public class BunchOfFlowers {

    LinkedList<String> flowers = new LinkedList<>();

    public LinkedList<String> getFlowers() {
        return flowers;
    }

    public void addFlower(String flower) {
        flowers.add(flower);
    }

    public void addFlowerInTheMiddle(String flower) {
        int index = flowers.size() / 2;
        if (flowers.size() % 2 == 0) {
            flowers.add(index, flower);
        } else {
            flowers.add(index, flower);
            flowers.add(index + 2, flower);
        }
    }
}