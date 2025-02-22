package interview;

import java.util.Arrays;

public class Problem242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        Problem242 solution = new Problem242();
        System.out.println(solution.isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        return Arrays.equals(s.chars().sorted().toArray(), t.chars().sorted().toArray());
    }
}
