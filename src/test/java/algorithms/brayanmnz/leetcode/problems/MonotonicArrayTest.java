package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonotonicArrayTest {

    @Test
    public void validParenthesesTestFunction(){
        int[] test1 = {1, 2, 3};
        int[] test2 = {1,2,2,3};
        int[] test3 = {6,5,4,4};
        int[] test4 = {1,3,2};
        int[] test5 = {1,1,2};
        Assert.assertTrue(MonotonicArray.isMonotonic(test1));
        Assert.assertTrue(MonotonicArray.isMonotonic(test2));
        Assert.assertTrue(MonotonicArray.isMonotonic(test3));
        Assert.assertFalse(MonotonicArray.isMonotonic(test4));
        Assert.assertTrue(MonotonicArray.isMonotonic(test5));

//        Assert.assertTrue(ValidParentheses.isValid("[]{}()"));
//        Assert.assertTrue(ValidParentheses.isValid("{[]}"));
    }

}