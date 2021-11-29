package algorithmscount.height;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTest {

    Height height = new Height();
    List<Integer> childrenListWithHeights = Arrays.asList(100, 125, 135, 115, 110);

    @Test
    void countChildrenWithHeightGreaterThanTest() {
        assertEquals(2, height.countChildrenWithHeightGreaterThan(childrenListWithHeights, 120));
    }
}
