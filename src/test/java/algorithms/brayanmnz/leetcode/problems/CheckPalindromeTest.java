package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    @Test
    public void isPalindrome() {
        Assert.assertFalse(CheckPalindrome.isPalindrome("hola"));
        Assert.assertTrue(CheckPalindrome.isPalindrome("aabaa"));
        Assert.assertTrue(CheckPalindrome.isPalindrome("aabaa"));
        Assert.assertFalse(CheckPalindrome.isPalindrome("abac"));
    }
}