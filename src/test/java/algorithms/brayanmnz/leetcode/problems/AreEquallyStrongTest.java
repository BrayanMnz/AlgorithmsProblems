package algorithms.brayanmnz.leetcode.problems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AreEquallyStrongTest {
    @Test
    public void testSolution() {
        assertTrue(AreEquallyStrong.solution(10, 15, 15,10));
        assertFalse(AreEquallyStrong.solution(10, 15, 5,20));
        assertFalse(AreEquallyStrong.solution(15, 10, 5,9));
        assertTrue(AreEquallyStrong.solution(10, 15, 15,10));


    }
}
