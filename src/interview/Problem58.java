package interview;

public class Problem58 {
    public static void main(String[] args) {
        String s = "Hello World";

        Problem58 solution = new Problem58();
        System.out.println(solution.lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        int i = ss.length-1;
        while (ss[i].trim().isEmpty()){
            i--;
        }
        return ss[i].length();
    }
}
