package interview;

class Solution {
    public static void main(String[] args) {
        System.out.println(fib(2)); // returns 1
        System.out.println(fib(3)); // returns 2
        System.out.println(fib(4)); // returns 3
    }

    public int fib(int n) {
        if (n < 2)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
}