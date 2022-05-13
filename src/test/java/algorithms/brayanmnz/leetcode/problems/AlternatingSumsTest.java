package algorithms.brayanmnz.leetcode.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AlternatingSumsTest {

    @Test
    public void solution() {
        assertEquals(Arrays.toString((new int[]{180, 105})), Arrays.toString(AlternatingSums.solution((new int[]{50, 60, 60, 45, 70}))));
        assertEquals(Arrays.toString((new int[]{100, 50})), Arrays.toString(AlternatingSums.solution((new int[]{100, 50}))));
        assertEquals(Arrays.toString((new int[]{150, 151})), Arrays.toString(AlternatingSums.solution((new int[]{100, 51, 50, 100}))));
    }
}