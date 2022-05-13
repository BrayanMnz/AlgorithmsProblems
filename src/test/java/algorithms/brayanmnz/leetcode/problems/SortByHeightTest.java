package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

public class SortByHeightTest {

    @Test
    public void SortByHeightTesting() {
        int[] expectedOutput1 = new int[]{-1, 150, 160, 170, -1, -1, 180, 190};
        int[] expectedOutput2 = new int[]{-1, -1, -1, -1, -1};
        int[] expectedOutput3 = new int[]{2, 2, 4, 9, 11, 16};

        Assert.assertEquals(expectedOutput1, SortByHeight.solution(new int[]{-1, 150, 190, 170, -1, -1, 160, 180}));
        Assert.assertEquals(expectedOutput2, SortByHeight.solution(new int[]{-1, -1, -1, -1, -1}));
        Assert.assertEquals(expectedOutput3, SortByHeight.solution(new int[]{4, 2, 9, 11, 2, 16}));

    }
}