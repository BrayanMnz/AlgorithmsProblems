package algorithms.brayanmnz.leetcode.problems;


import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void validParenthesesTestFunction(){
        Assert.assertTrue(ValidParentheses.isValid("()[]{}"));
        Assert.assertTrue(ValidParentheses.isValid("()"));
        Assert.assertTrue(ValidParentheses.isValid("[]{}()"));
        Assert.assertTrue(ValidParentheses.isValid("{[]}"));

    }

    @Test
    public void InvalidParenthesesTestFunction(){
        Assert.assertFalse(ValidParentheses.isValid("()[){"));
        Assert.assertFalse(ValidParentheses.isValid("([){"));
    }

}