package interview;

public class Problem509 {
    public static void main(String[] args) {
        Problem509 solution = new Problem509();

        System.out.println(solution.fib(2)); // returns 1
        System.out.println(solution.fib(3)); // returns 2
        System.out.println(solution.fib(4)); // returns 3
    }

    public int fib(int n) {
        if (n < 2)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
}