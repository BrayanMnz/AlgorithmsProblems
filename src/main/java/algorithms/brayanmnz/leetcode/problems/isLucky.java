package algorithms.brayanmnz.leetcode.problems;

import java.util.Stack;

public class isLucky {

    static boolean solution(int n) {
        if (n < 0) return false;
        int num1 = 0;
        int num2 = 0;
        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            stack.push(n % 10);
            n = n / 10;
        }

        int middle = stack.size() / 2;
        while (!stack.empty()) {
            if (stack.size() > middle) {
                num1 += stack.pop();
            } else {
                num2 += stack.pop();
            }
        }

        return (num1 == num2);
    }
}
