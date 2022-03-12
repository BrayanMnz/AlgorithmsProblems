package algorithms.brayanmnz.leetcode.problems;

import java.util.Stack;

public class CheckPalindrome {

    public static boolean isPalindrome(String inputString){

        //New solution after figure out reverse() function in StringBuilder
        return inputString.equals(new StringBuilder(inputString).reverse().toString());

        //return inputString.equals(reverseString(inputString));
    }


/*
    public static String reverseString(String auxString){
        Stack<Character> auxStack = new Stack<>();
        for (int i = 0; i <auxString.length(); i++) {
            auxStack.push(auxString.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while(!auxStack.isEmpty()){
            result.append(auxStack.pop());
        }
        return result.toString();
    } */

}
