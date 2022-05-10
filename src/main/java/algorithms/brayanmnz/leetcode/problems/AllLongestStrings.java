package algorithms.brayanmnz.leetcode.problems;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class AllLongestStrings {

   static String[] solution(String[] inputArray) {
        int longest = 0;
        List<String> result = new ArrayList<>();

        for (String str : inputArray) {
            if(str.length() > longest){
                longest = str.length();
                result.clear();
                result.add(str);
            }
            else if(str.length() == longest){
                result.add(str);
            }
        }
        String[] arr = new String[result.size()];
        return result.toArray(arr);
    }

}
