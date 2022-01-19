package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void searchPeakTest() {
        double[] heights = new double[] {2500.5,1432.1,6512.3,100.2};

        assertTrue(new Mountain(heights).searchPeak(new Peak("Legmagasabb",6512.3)));
        assertFalse(new Mountain(heights).searchPeak(new Peak("Nincs-hegy",2584)));
    }

}