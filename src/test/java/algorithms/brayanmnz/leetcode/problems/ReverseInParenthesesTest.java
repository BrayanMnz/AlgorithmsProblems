package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

public class ReverseInParenthesesTest {

    @Test
    public void parenthesesInsideParentheses() {
        Assert.assertEquals("foobazrabblim", ReverseInParentheses.solution("foo(bar(baz))blim"));
        Assert.assertEquals("", ReverseInParentheses.solution(""));
        Assert.assertEquals("cbadgfe", ReverseInParentheses.solution("(abc)d(efg)"));
    }
}