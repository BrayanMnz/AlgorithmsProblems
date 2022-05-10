package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllLongestStringsTest {

    @Test
    public void solution() {

        String[] input1 = {"aba", "aa", "ad", "vcd", "aba"};
        String [] expectedOutput1 = {"aba", "vcd", "aba"};
        Assert.assertEquals(expectedOutput1, AllLongestStrings.solution(input1));
    }
}