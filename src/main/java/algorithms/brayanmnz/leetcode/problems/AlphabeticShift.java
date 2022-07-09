package algorithms.brayanmnz.leetcode.problems;

public  class AlphabeticShift {

    static String solution(String inputString) {
        StringBuilder aux = new StringBuilder();
        
        for(char c : inputString.toCharArray()){
            if(Character.compare(c, 'z') == 0) {
            aux.append('a');}
            else{
            aux.append((char) (c+1));
            }
        }
            
            return aux.toString();
    }
    
}