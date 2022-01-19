package searching;

import java.util.Arrays;

public class Mountain {

    private double[] peakHeights;

    public Mountain(double[] pikeHeights) {
        this.peakHeights = pikeHeights;
    }

    public double[] getPeakHeights() {
        return peakHeights;
    }

    public boolean searchPeak(Peak peak) {
        double height = Arrays.binarySearch(peakHeights, peak.getHeight());
        return height >= 0;

    }
}
