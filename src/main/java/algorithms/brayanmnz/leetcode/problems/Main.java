package algorithms.brayanmnz.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // System.out.println(solution(new int[]{2, 4, 7}));
        // System.out.println(firstPalindrome(new String[] { "abc", "car", "ada",
        // "racecar", "cool" }));

        // /*
        // * turn the pattern into a List of characters
        // * turn the List into a HashMap with the keys as the characters and
        // * the values as the indexes of the characters in the List
        // */
        // ArrayList<Character> listOfPatternChars =
        // convertStringToCharList(userPattern);
        // HashMap<Character, ArrayList<Integer>> mapOfPatternCharsIndex = new
        // HashMap<Character, ArrayList<Integer>>();

        // ArrayList<ArrayList<Integer>> arrayOfIndexes = new
        // ArrayList<ArrayList<Integer>>();

        // for (int i = 0; i < listOfPatternChars.size(); i++) {
        // mapOfPatternCharsIndex.putIfAbsent(listOfPatternChars.get(i), new
        // ArrayList<Integer>());
        // mapOfPatternCharsIndex.computeIfPresent(listOfPatternChars.get(i), (k, v) ->
        // v.add(i));
        // }

        // System.out.println("DEBUG --> " + arrayChange(new int[] { 1, 1, 1 }));
        // System.out.println("DEBUG -->"+palindromeRearranging("abbcabb"));
        // System.out.println("DEBUG -->" + arrayMaximalAdjacentDifference(new int[] {
        // 2, 4, 1, 0 }));
        // System.out.println(isIPv4Address("172.16.254.1"));
        // System.out.println(avoidObstacles(new int[] { 5, 3, 6, 7, 9 }));
        // System.out.println(solution1("abacabad"));

        int deposit = 100;
        int rate = 20;
        int threshold =170;

    double total = deposit;
    int i = 1;
    double rt = 1 + ((double) rate/100);
    while(total < threshold){
        total = total * rt;
        i++;
    }
    
   System.out.println(i);


        
        
    }

    static int solution(int[] a) {
        int tmp = 2000000;
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            int tmpSum = 0;
            for (int j = 0; j < a.length; j++) {
                tmpSum += Math.abs(a[j] - a[i]);
            }
            if (tmpSum < tmp) {
                result = a[i];
                tmp = tmpSum;
            }
        }
        return result;
    }

    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String auxString = new StringBuilder()
                    .append(words[i]).reverse().toString();

            if (auxString.equals(words[i])) {
                return words[i];
            }
        }
        return "";

    }

    public static int arrayChange(int[] inputArray) {
        int aux = 0;
        boolean done = false;
        int i = 0;
        while (!done && i < inputArray.length - 1) {
            if (inputArray[i] < inputArray[i + 1]) {
                i++;
            } else if (inputArray[i] > inputArray[i + 1] || inputArray[i] == inputArray[i + 1]) {
                inputArray[i + 1] += 1;
                aux++;
            } else {
                done = true;
            }

        }

        return aux;
    }

    public static boolean palindromeRearranging(String inputString) {
        if (inputString.length() == 1)
            return true;
        HashMap<Character, Integer> aux = new HashMap<Character, Integer>();
        for (char x : inputString.toCharArray()) {
            aux.put(x, aux.get(x) != null ? aux.get(x) + 1 : 1);
        }
        int odd = 0;
        for (int value : aux.values()) {
            if (value % 2 == 1) {
                odd++;
                if (odd == 2)
                    return false;
            }
        }
        return true;
    }

    public static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int aux = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (Math.abs(inputArray[i] - inputArray[i + 1]) > aux)
                aux = Math.abs(inputArray[i] - inputArray[i + 1]);
        }

        return aux;
    }

    public static boolean isIPv4Address(String inputString) {
        String[] aux = inputString.split("\\.");
        if (aux.length != 4)
            return false;

        try {
            for (String string : aux) {
                if (Integer.parseInt(string) < 0 || Integer.parseInt(string) > 255 || string.isEmpty())
                    return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static int avoidObstacles(int[] inputArray) {

        int jump = 2;
        boolean aux = true;

        while (aux) {
            for (int i = 0; i < inputArray.length; i++)
                if (inputArray[i] % jump == 0) {
                    jump++;
                    break;
                }
        }

        return jump;
    }

    static int[][] mineSweeper(boolean[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int neighbors = 0;
                // 0,0 0,1 0,2
                // 1,0 [1,1] 1,2
                // 2,0 2,1 2,2

                // top
                if (i > 0 && matrix[i - 1][j])
                    neighbors++;

                // bottom
                if (i + 1 < matrix.length && matrix[i + 1][j])
                    neighbors++;

                // left
                if (j > 0 && matrix[i][j - 1])
                    neighbors++;

                // right
                if (j + 1 < matrix[0].length && matrix[i][j + 1])
                    neighbors++;

                // upper left
                if (i > 0 && j > 0 && matrix[i - 1][j - 1])
                    neighbors++;

                // upper right
                if (i > 0 && j + 1 < matrix[0].length && matrix[i - 1][j + 1])
                    neighbors++;

                // lower left
                if (i + 1 < matrix.length && j > 0 && matrix[i + 1][j - 1])
                    neighbors++;

                // lower right
                if (i + 1 < matrix.length && j + 1 < matrix[0].length && matrix[i + 1][j + 1])
                    neighbors++;

                result[i][j] = neighbors;
            }
        }

        return result;

    }

    static char solution1(String s) {
        Map<Character, Integer> auxMap = new HashMap<>();

        int aux = 0;
        while (aux < s.length()) {
            for (char j : s.toCharArray()) {
                if (auxMap.get(j) == null) {
                    auxMap.put(j, 1);
                } else {
                    auxMap.put(j, auxMap.get(j) + 1);
                }
                aux++;
            }

        }
        for (char j : s.toCharArray()) {
            if (auxMap.get(j) == 1)
                return j;
        }
        return '_';

    }

}