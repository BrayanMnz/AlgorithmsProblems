package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

public class AlphabeticShiftTest {


    @Test
    public void test1() {

        Assert.assertEquals("dsbaz",AlphabeticShift.solution("crazy"));
    }

    @Test
    public void test2() {

        Assert.assertEquals("bbbbcccdde",AlphabeticShift.solution("aaaabbbccd"));
    }

}
