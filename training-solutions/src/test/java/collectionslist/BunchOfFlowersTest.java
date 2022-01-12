package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {
    BunchOfFlowers bunchOfFlowers;

    @BeforeEach
    void createFlowers() {
        bunchOfFlowers = new BunchOfFlowers();
        bunchOfFlowers.addFlower("papagájvirág");
        bunchOfFlowers.addFlower("papagájvirág");
        bunchOfFlowers.addFlower("papagájvirág");
        bunchOfFlowers.addFlower("papagájvirág");
    }

    @Test
    void addFlowerEven() {
        bunchOfFlowers.addFlowerInTheMiddle("denevérvirág");

        assertEquals("denevérvirág", bunchOfFlowers.getFlowers().get(2));

    }

    @Test
    void addFlowerOdd() {
        bunchOfFlowers.addFlower("papagájvirág");
        bunchOfFlowers.addFlowerInTheMiddle("denevérvirág");

        assertEquals("papagájvirág", bunchOfFlowers.getFlowers().get(0));
        assertEquals("papagájvirág", bunchOfFlowers.getFlowers().get(1));
        assertEquals("denevérvirág", bunchOfFlowers.getFlowers().get(2));
        assertEquals("papagájvirág", bunchOfFlowers.getFlowers().get(3));
        assertEquals("denevérvirág", bunchOfFlowers.getFlowers().get(4));
        assertEquals("papagájvirág", bunchOfFlowers.getFlowers().get(5));
        assertEquals("papagájvirág", bunchOfFlowers.getFlowers().get(6));
    }
}