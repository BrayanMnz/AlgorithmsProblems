package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeAreaTest {

    @Test
    public void shapeAreaTestFunction(){
        Assert.assertEquals(13, ShapeArea.shapeAreaSolution(3));
        Assert.assertEquals(5, ShapeArea.shapeAreaSolution(2));
        Assert.assertEquals(41, ShapeArea.shapeAreaSolution(5));
        Assert.assertEquals(97986001, ShapeArea.shapeAreaSolution(7000));
        Assert.assertEquals(19801, ShapeArea.shapeAreaSolution(100));
    }

}