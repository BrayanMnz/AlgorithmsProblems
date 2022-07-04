package algorithms.brayanmnz.leetcode.problems;

public class ArrayChange {

    public static int solution(int[] inputArray) {
        int aux = 0;
        boolean done = false;
        int i = 0;
        while (!done && i < inputArray.length - 1) {
            if (inputArray[i] < inputArray[i + 1]) {
                i++;
            } else if (inputArray[i] >= inputArray[i + 1]) {
                inputArray[i + 1] += 1;
                aux++;
            } else {
                done = true;
            }
        }
        return aux;
    }

}
