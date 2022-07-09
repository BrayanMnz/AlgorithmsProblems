package algorithms.brayanmnz.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter {

    
    static char solution(String s) {
        Map<Character, Integer> auxMap = new HashMap<>();
    
        int aux = 0;
    
            for (char j : s.toCharArray()) {
               if(aux >= s.length()) break;
                auxMap.put(j, auxMap.get(j) == null ? 1 :auxMap.get(j) + 1);
                aux++;
                }       
    
            for (char j : s.toCharArray()) {
                if(auxMap.get(j) == 1) return j;
            }
            return '_';  
    }
    
}