package algorithms.brayanmnz.leetcode.problems;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(ValidParentheses.isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char auxChar : s.toCharArray()) {
            switch (auxChar) {
                case '(':
                    stack.push(')');
                    continue;
                case '{':
                    stack.push('}');
                    continue;
                case '[':
                    stack.push(']');
                    continue;
            } if(stack.empty() || stack.pop() != auxChar)  return false;
        }
        return stack.isEmpty(); }

}
