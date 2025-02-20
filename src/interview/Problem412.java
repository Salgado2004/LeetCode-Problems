package interview;

import java.util.ArrayList;
import java.util.List;

public class Problem412 {
    public static void main(String[] args) {
        int n = 15;

        Problem412 solution = new Problem412();
        System.out.println(solution.fizzBuzz(n));
    }

    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if (i % 15 == 0){
                output.add("FizzBuzz");
            } else if (i % 3 == 0){
                output.add("Fizz");
            } else if (i % 5 == 0){
                output.add("Buzz");
            } else {
                output.add(String.valueOf(i));
            }
        }

        return output;
    }
}
