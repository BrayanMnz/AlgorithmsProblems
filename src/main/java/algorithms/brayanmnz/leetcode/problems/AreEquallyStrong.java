package algorithms.brayanmnz.leetcode.problems;

public class AreEquallyStrong {

    public static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return Math.max(yourRight, yourLeft) == Math.max(friendsRight, friendsLeft)
                && Math.min(yourRight, yourLeft) == Math.min(friendsRight, friendsLeft);
    }

}
