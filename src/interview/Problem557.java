package interview;

public class Problem557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        Problem557 solution = new Problem557();
        System.out.println(solution.reverseWords(s));
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++){
            words[i] = reverse(words[i]);
        }

        return String.join(" ", words);
    }

    public String reverse(String s){
        StringBuilder newS = new StringBuilder();

        for(int i = s.length()-1; i >=0 ; i--){
            newS.append(s.charAt(i));
        }

        return newS.toString();
    }
}
