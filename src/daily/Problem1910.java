package daily;

public class Problem1910 {
    public static void main(String[] args) {
        String s = "aabababa";
        String part = "aba";

        Problem1910 solution = new Problem1910();
        System.out.println(solution.removeOccurrences(s, part));
    }

    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}
