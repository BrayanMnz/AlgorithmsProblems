package algorithms.brayanmnz.leetcode.problems;

/*
Given an array of integers,
find the pair of adjacent elements
that has the largest product and return that product.

       Guaranteed constraints:
 ===  2 ≤ inputArray.length ≤ 10,
 ===  -1000 ≤ inputArray[i] ≤ 1000
 */
public class AdjacentElementsProduct {


    public static int adjacentElements(int[] inputArray) {
        if(inputArray.length == 2){
            return inputArray[0] * inputArray[1];
        }
        int product = inputArray[0]*inputArray[1];
        for (int i = 0; i <inputArray.length - 1 ; i++) {
            int auxProduct = inputArray[i]*inputArray[i+1];
            product = Math.max(product,auxProduct);
        }
        return product;
    }
}
