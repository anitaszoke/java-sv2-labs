package algorithmscount.height;

import java.util.Arrays;
import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heights, int minHeight) {
        int count = 0;
        for (int i = 0; i < heights.size(); i++) {
            if (heights.get(i) > minHeight) {
                count++;
            }
        }
        return count;
    }
}