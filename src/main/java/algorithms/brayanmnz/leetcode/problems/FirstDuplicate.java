package algorithms.brayanmnz.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {

   public static int solution(int[] a) {
        Map<Integer, Integer> auxMap = new HashMap<>();

        for (int j : a) {

            if (auxMap.get(j) != null) return j;

            auxMap.put(j, auxMap.get(j) != null ? auxMap.get(j) + 1 : 0);
        }
        return -1;
    }

}
