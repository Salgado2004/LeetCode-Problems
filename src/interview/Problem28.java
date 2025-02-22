package interview;

public class Problem28 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        Problem28 solution = new Problem28();
        System.out.println(solution.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
