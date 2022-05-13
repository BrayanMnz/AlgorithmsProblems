package algorithms.brayanmnz.leetcode.problems;


/*
 *
 * For a = [50, 60, 60, 45, 70],
 * the output should be solution(a) = [180, 105]
 *
 * @author BrayanMnz
 * */
public class AlternatingSums {

    static int[] solution(int[] a) {
        int[] result = new int[]{a[0], 0};

        for (int i = 1; i < a.length; i++) {
            if (i % 2 == 0) result[0] += a[i];
            else result[1] += a[i];
        }
        return result;
    }


}
