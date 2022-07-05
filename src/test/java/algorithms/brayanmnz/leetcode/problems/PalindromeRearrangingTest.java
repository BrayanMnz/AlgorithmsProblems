package algorithms.brayanmnz.leetcode.problems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeRearrangingTest {
    @Test
    public void testSolution() {
        assertTrue(PalindromeRearranging.solution("aabb"));
        assertFalse(PalindromeRearranging.solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));
        assertFalse(PalindromeRearranging.solution("abdhuierf"));
        assertFalse(PalindromeRearranging.solution("abcad"));
        assertTrue(PalindromeRearranging.solution("zaa"));

    }
}
