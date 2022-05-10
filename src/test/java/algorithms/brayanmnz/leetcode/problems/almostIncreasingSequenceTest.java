package algorithms.brayanmnz.leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class almostIncreasingSequenceTest {
    @Test
    public void checkAlmostIncreaseSequence(){
        int[] test = {1,3,2,1};
        int[] test1 = {1,3,2};
        int[] test2 = {1,2,1,2};
        int[] test3 = {40, 50, 60, 10, 20, 30};
        int[] test4 = {1, 1, 2, 3, 4, 4};
        int[] test5 = {1, 2, 3, 4, 99, 5, 6};
        int[] test6 = {10, 1, 2, 3, 4, 5};
        assertFalse(almostIncreasingSequence.almostIncreasing(test));
        assertTrue(almostIncreasingSequence.almostIncreasing(test1));
        assertFalse(almostIncreasingSequence.almostIncreasing(test2));
        assertFalse(almostIncreasingSequence.almostIncreasing(test3));
        assertFalse(almostIncreasingSequence.almostIncreasing(test4));
        assertTrue(almostIncreasingSequence.almostIncreasing(test5));
        assertTrue(almostIncreasingSequence.almostIncreasing(test6));
    }

}