package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

public class isLuckyTest {

    @Test
    public void isLuckyNumber() {

        int input1 = 1230;
        int input2 = 239017;
        int input3 = 123321;
        int input4 = 261534;
        int input5 = 1010;

        Assert.assertTrue(isLucky.solution(input1));
        Assert.assertFalse(isLucky.solution(input2));
        Assert.assertTrue(isLucky.solution(input3));
        Assert.assertFalse(isLucky.solution(input4));
        Assert.assertTrue(isLucky.solution(input5));

    }

}