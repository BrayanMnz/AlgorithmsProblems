package algorithms.brayanmnz.leetcode.problems;

import java.util.Arrays;

public class AreSimilar {

    static boolean solution(int[] a, int[] b) {
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                int temp = b[i];
                int position = searchForValue(b, i, a[i], a);
                if (position == 0) return false;
                b[i] = b[position];
                b[position] = temp;
                flag++;
            }
            if (flag > 1) return false;
        }

        return true;
    }

    //return position where the value it's placed.
    static int searchForValue(int[] array, int startIndex, int value, int[] firstArray) {

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] == value && array[i] != firstArray[i]) return i;
        }
        return 0;
    }

    static boolean solution2(int[] a, int[] b) {
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) flag++;
            if (flag>2) return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
