package algorithms.brayanmnz.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeMachine {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{8, 5, 6, 16, 5}, 1, 3)));
    }

    /*
     * Bill available = [1, 5, 10, 20, 50, 100]
     *
     *
     */
    static List<Integer> solution(int number) {
        int[] bill = new int[]{1, 5, 10, 20, 50, 100};
        int billIterator = 5;
        List<Integer> result = new ArrayList<>();

        while (number > 0) {
            if (number - bill[billIterator] >= 0) {
                number -= bill[billIterator];
                result.add(bill[billIterator]);
            } else billIterator--;
        }

        return result;
    }

    static boolean[] solution2(int[] numbers, int left, int right) {
        boolean[] result = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = left; j <= right; j++) {
                if (numbers[i] == ((i + 1) * j)) {
                    result[i] = true;
                    break;
                } else result[i] = false;
            }
        }
        return result;
    }

}
