package interview;

public class Problem9 {
    public static void main(String[] args) {
        int x = -121;

        Problem9 solution = new Problem9();
        System.out.println(solution.isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        return s.equals(reverse(s));
    }

    public String reverse(String s){
        StringBuilder newS = new StringBuilder();

        for(int i = s.length()-1; i >=0 ; i--){
            newS.append(s.charAt(i));
        }

        return newS.toString();
    }
}
