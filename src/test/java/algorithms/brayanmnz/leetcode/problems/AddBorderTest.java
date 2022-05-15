package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AddBorderTest {

    @Test
    public void solution() {
        Assert.assertEquals(Arrays.toString(new String[]{"*****",
                "*abc*",
                "*ded*",
                "*****"}), Arrays.toString(AddBorder.solution(new String[]{"abc",
                "ded"})));
    }
}