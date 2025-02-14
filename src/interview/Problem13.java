package interview;

import java.util.Map;

public class Problem13 {
    Map<Character, Integer> constants = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static void main(String[] args) {
        String s = "MMMCMXCIX";

        Problem13 solution = new Problem13();
        System.out.println(solution.romanToInt(s));
    }

    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i ++){
            int current = constants.get(s.charAt(i));
            if (i < s.length() - 1){
                int next = constants.get(s.charAt(i+1));
                if (next > current) {
                    num += next - current;
                    i++;
                    continue;
                }
            }
            num += current;
        }
        return num;
    }
}
