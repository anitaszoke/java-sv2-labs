package labels;

import controladvanced.labels.Labels;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {
    @Test
    void testLabels() {
        Labels labels = new Labels();
        int[][] table = labels.getTableOfNumbers(6);
        assertEquals(4, table[1][1]);
        assertEquals(11, table[4][5]);
    }
}
