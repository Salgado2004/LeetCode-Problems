package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem151 {
    public static void main(String[] args) {
        String s = "the sky is blue";

        Problem151 solution = new Problem151();
        System.out.println(solution.reverseWords(s));
    }

    public String reverseWords(String s) {
        List<String> ss = new ArrayList<>(Arrays.stream(s.split(" ")).map(String::trim).filter(str -> !str.isEmpty()).toList());
        for (int i =0, j = ss.size() -1; i < j; i++, j--){
            String aux = ss.get(i);
            ss.set(i, ss.get(j));
            ss.set(j, aux);
        }
        return String.join(" ", ss);
    }
}
