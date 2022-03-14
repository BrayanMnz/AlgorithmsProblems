package algorithms.brayanmnz.leetcode.problems;

public class ShapeArea {

    public static int shapeAreaSolution(int n){
        return (int) (Math.pow(n,2) + Math.pow(n-1,2));
    }
}
