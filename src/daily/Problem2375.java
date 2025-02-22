package daily;

import java.util.Stack;

public class Problem2375 {
  public static void main(String[] args) {
        String pattern = "DIDDI";

        Problem2375 solution = new Problem2375();
        System.out.println(solution.smallestNumber(pattern));
    }

  public String smallestNumber(String pattern) {
        StringBuilder number = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i < pattern.length()+1 ; i++ ){
            stack.push(i+1);
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.empty()){
                    number.append(stack.pop());
                }
            }
        }

        return number.toString();
    }
}
