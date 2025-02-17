package interview;

public class Problem125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        Problem125 solution = new Problem125();
        System.out.println(solution.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
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
