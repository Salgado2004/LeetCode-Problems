package interview;

public class Problem392 {
    public static void main(String[] args) {
        String s = "aec";
        String t = "abcdec";

        Problem392 solution = new Problem392();
        System.out.println(solution.isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        int matches = 0;
        if (s.isEmpty()) return true;
        for (int i = 0; i < t.length(); i++){
            if (t.charAt(i) == s.charAt(matches))
                matches++;
            if (matches == s.length())
                break;
        }
        return matches == s.length();
    }
}
