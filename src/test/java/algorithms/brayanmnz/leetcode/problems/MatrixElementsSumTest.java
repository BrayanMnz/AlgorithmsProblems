package algorithms.brayanmnz.leetcode.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixElementsSumTest {

    @Test
    public void test() {
        int[][] matrix =
                {{1, 1, 1, 0},
                 {0, 5, 0, 1},
                 {2, 1, 3, 10}};

        int[][] matrix1 =
                       {{0, 1, 1, 2},
                        {0, 5, 0, 0},
                        {2, 0, 3, 3}};
        assertEquals(9,MatrixElementsSum.solution(matrix));
        assertEquals(9,MatrixElementsSum.solution(matrix));

    }
}