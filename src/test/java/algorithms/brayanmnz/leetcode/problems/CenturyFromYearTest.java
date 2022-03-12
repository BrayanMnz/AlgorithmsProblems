package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CenturyFromYearTest {

    @Test
    public void validCenturyFromYearFunction() {

        Assert.assertEquals(20, CenturyFromYear.solution(1905));
        Assert.assertEquals(17, CenturyFromYear.solution(1700));
        Assert.assertEquals(20, CenturyFromYear.solution(2000));
        Assert.assertEquals(1, CenturyFromYear.solution(8));
    }
}


