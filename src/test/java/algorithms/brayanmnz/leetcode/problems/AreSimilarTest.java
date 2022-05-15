package algorithms.brayanmnz.leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AreSimilarTest {

    @Test
    public void testingFirstSolution() {
        assertTrue(AreSimilar.solution(new int[]{1, 2, 3}, new int[]{2, 1, 3}));
        assertFalse(AreSimilar.solution(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
        assertTrue(AreSimilar.solution(new int[]{2, 3, 1}, new int[]{1, 3, 2}));
        assertTrue(AreSimilar.solution(new int[]{2, 9, 6, 8, 9, 5}, new int[]{2, 5, 6, 8, 9, 9}));
        assertFalse(AreSimilar.solution(new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279}, new int[]{832, 570, 148, 998, 533, 561, 455, 147, 894, 279}));
    }

    @Test
    public void testingRefactoredSolution() {
        assertTrue(AreSimilar.solution2(new int[]{1, 2, 3}, new int[]{2, 1, 3}));
        assertFalse(AreSimilar.solution2(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
        assertTrue(AreSimilar.solution2(new int[]{2, 3, 1}, new int[]{1, 3, 2}));
        assertTrue(AreSimilar.solution2(new int[]{2, 9, 6, 8, 9, 5}, new int[]{2, 5, 6, 8, 9, 9}));
        assertFalse(AreSimilar.solution2(new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279}, new int[]{832, 570, 148, 998, 533, 561, 455, 147, 894, 279}));
    }
}