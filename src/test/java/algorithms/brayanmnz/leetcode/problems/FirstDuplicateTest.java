package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDuplicateTest {

    @Test
    public void solution() {

        Assert.assertEquals(3, FirstDuplicate.solution(new int[]{2, 1, 3, 5, 3, 2}));
        Assert.assertEquals(2, FirstDuplicate.solution(new int[]{2,2}));
        Assert.assertEquals(-1, FirstDuplicate.solution(new int[]{1}));
        Assert.assertEquals(-1, FirstDuplicate.solution(new int[]{10, 6, 8, 4, 9, 1, 7, 2, 5, 3}));

    }
}