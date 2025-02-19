package interview;

import java.util.List;
import java.util.Stack;

public class Problem345 {
    public static void main(String[] args) {
        String s = "leetcode";

        Problem345 solution = new Problem345();
        System.out.println(solution.reverseVowels(s));
    }

    public String reverseVowels(String s) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        Stack<Character> characters = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++ ){
            char ch = s.charAt(i);
            if (vowels.contains(ch)){
                characters.push(ch);
            }
        }

        for (int i = 0; i < s.length(); i++ ){
            char ch = s.charAt(i);
            if (vowels.contains(ch)){
                ch = characters.pop();
            }
            result.append(ch);
        }

        return result.toString();
    }
}
