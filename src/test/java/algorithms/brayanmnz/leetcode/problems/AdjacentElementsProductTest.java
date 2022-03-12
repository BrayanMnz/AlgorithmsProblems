package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdjacentElementsProductTest {


    @Test
    public void productBetweenAdjacents(){
        int[] test1 = {3, 6, -2, -5, 7, 3};
        int[] test2 = {-2, -5};
        int[] test3 = {-23, 4, -3, 8, -12};
        Assert.assertEquals(21, AdjacentElementsProduct.adjacentElements(test1));
        Assert.assertEquals(10, AdjacentElementsProduct.adjacentElements(test2));
        Assert.assertEquals(-12, AdjacentElementsProduct.adjacentElements(test3));

    }

}