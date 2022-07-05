package algorithms.brayanmnz.leetcode.problems;

import java.util.HashMap;

public class PalindromeRearranging {

    public static boolean solution(String inputString) {
        if(inputString.length() == 1) return true;
        HashMap<Character, Integer> aux = new HashMap<>();
        for (char x : inputString.toCharArray()) {
            aux.put(x, aux.get(x) != null ? aux.get(x)+1 : 1);
        }
        int odd = 0;
        for (int value : aux.values()) {
            if(value % 2 == 1 ) {
                odd++;
                if (odd == 2) return false;
            }
        }
        return true;
    }

}
