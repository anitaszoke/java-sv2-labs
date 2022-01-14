package collectionsiterator.present;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {

    @Test
    void removeExpensivePresent() {
        List<ChristmasPresent> presents = new ArrayList<>();
        ChristmasShopping shopping = new ChristmasShopping(presents);
        presents.add(new ChristmasPresent("keksz","Alma",500));
        presents.add(new ChristmasPresent("csont","Málna",1000));
        presents.add(new ChristmasPresent("laktózmentes tej","Cirmi",2000));

        shopping.removeTooExpensivePresent(1500);

        assertEquals(2,presents.size());

    }

}