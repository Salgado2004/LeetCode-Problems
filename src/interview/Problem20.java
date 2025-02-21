package interview;

import java.util.EmptyStackException;
import java.util.Stack;

public class Problem20 {
    public static void main(String[] args) {
        String s = ")[](";

        Problem20 solution = new Problem20();
        System.out.println(solution.isValid(s));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> brackets = new Stack<>();
        char pair;

        for (char c : s.toCharArray()) {
            try {
                switch (c) {
                    case '(':
                    case '[':
                    case '{':
                        brackets.push(c);
                        break;
                    case ')':
                        pair = brackets.pop();
                        if (pair != '(')
                            return false;
                        break;
                    case ']':
                        pair = brackets.pop();
                        if (pair != '[')
                            return false;
                        break;
                    case '}':
                        pair = brackets.pop();
                        if (pair != '{')
                            return false;
                        break;
                }
            } catch (EmptyStackException ignored){
                return false;
            }
        }

        return brackets.empty();
    }
}
