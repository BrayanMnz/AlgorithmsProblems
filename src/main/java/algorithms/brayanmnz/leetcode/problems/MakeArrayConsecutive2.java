package algorithms.brayanmnz.leetcode.problems;
/*
Ratiorg got statues of different sizes as a present
from CodeMaster for his birthday, each statue having an
non-negative integer size. Since he likes to make things perfect,
 he wants to arrange them from smallest to largest so that each statue
 will be bigger than the previous one exactly by 1.
 He may need some additional statues to be able to accomplish that.
 Help him figure out the minimum number of additional statues needed.

For statues = [6, 2, 3, 8], the output should be
solution(statues) =

*/

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MakeArrayConsecutive2 {

    public static int solution(int[] statues){
        List<Integer> list = IntStream.of(statues).boxed().collect(Collectors.toList());
        return 1 + (Collections.max(list) - Collections.min(list) - list.size());
    }


}
