package algorithms.brayanmnz.leetcode.problems;

public class VariableName {

    static boolean solution(String name) {
        if (Character.isDigit(name.charAt(0)))
            return false;

        for (int i = 0; i < name.length(); i++) {

            if (!(Character.isDigit(name.charAt(i)) || ('a' <= name.charAt(i) && name.charAt(i) <= 'z')
                    || ('A' <= name.charAt(i) && name.charAt(i) <= 'Z') || name.charAt(i) == '_'))
                return false;
        }
        return true;
    }
}