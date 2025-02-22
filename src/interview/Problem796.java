package interview;

public class Problem796 {
    public static void main(String[] args) {
        String s = "gcmbf";
        String goal = "fgcmb";

        Problem796 solution = new Problem796();
        System.out.println(solution.rotateString(s, goal));
    }

    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
