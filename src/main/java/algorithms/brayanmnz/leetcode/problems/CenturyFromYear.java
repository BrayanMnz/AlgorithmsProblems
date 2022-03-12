package algorithms.brayanmnz.leetcode.problems;

public class CenturyFromYear {

    public static int solution(int year){
        System.out.println(year%100);
        if(year%100 >= 1){
           return ((int) Math.ceil((year/100) + 1));
        }
        else {
            return ((int) Math.ceil(year/100));
        }
}
}
