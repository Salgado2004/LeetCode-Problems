package interview;

public class Problem389 {
    public static void main(String[] args) {
        String s = "abc", t = "abcb";

        Problem389 solution = new Problem389();
        System.out.println(solution.findTheDifference(s, t));
    }

    public char findTheDifference(String s, String t) {
        int[] sc = s.chars().sorted().toArray();
        int[] tc = t.chars().sorted().toArray();
        int i;

        for (i = 0; i < sc.length; i++ ){
            if (sc[i] != tc[i])
                return (char) tc[i];
        }

        return (char) tc[i];
    }
}
