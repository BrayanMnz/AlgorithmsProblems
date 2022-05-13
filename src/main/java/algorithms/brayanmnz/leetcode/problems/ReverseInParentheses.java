package algorithms.brayanmnz.leetcode.problems;

public class ReverseInParentheses {

    static String solution(String inputString) {
        int firstIndex = inputString.lastIndexOf("(");
        int lastIndex = inputString.indexOf(")", firstIndex);

        while (firstIndex != -1) {
            String strToReverse = new StringBuilder(inputString.substring(firstIndex + 1, lastIndex)).reverse().toString();
            String first = inputString.substring(0, firstIndex);
            String last = inputString.substring(lastIndex + 1);
            inputString = first + strToReverse + last;
            firstIndex = inputString.lastIndexOf("(");
            lastIndex = inputString.indexOf(")", firstIndex);
        }
        return inputString;
    }

}
