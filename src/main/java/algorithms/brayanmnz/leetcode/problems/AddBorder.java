package algorithms.brayanmnz.leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AddBorder {

    static String[] solution(String[] picture) {
        List<String> result = new ArrayList<>();
        result.add(IntStream.range(0, picture[0].length() + 2).mapToObj(i -> "*").collect(Collectors.joining("")));
        for (String str : picture) {
            String auxStr = "*" + str + "*";
            result.add(auxStr);
        }
        result.add(IntStream.range(0, picture[0].length() + 2).mapToObj(i -> "*").collect(Collectors.joining("")));
        return result.toArray(new String[0]);
    }

}
