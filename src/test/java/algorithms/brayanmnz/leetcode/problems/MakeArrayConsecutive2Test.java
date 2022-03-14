package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MakeArrayConsecutive2Test {

    @Test
    public void MakeArrayconsecutive2Solution(){
        int[] test1 = {6,2,3,8};
        int[] test2 = {0,3};
        Assert.assertEquals(3, MakeArrayConsecutive2.solution(test1));
        Assert.assertEquals(2, MakeArrayConsecutive2.solution(test2));
    }

}