package com.RuntimeAnalysisAndBigONotation;

public class FibonacciComparison {

    // ---------- Recursive Fibonacci (O(2^n)) ----------
    static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // ---------- Iterative Fibonacci (O(n)) ----------
    static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        int[] values = {10, 30, 50};

        for (int n : values) {
            System.out.println("\nFibonacci N = " + n);

            long start, end;

            // Recursive
            if (n <= 40) { // avoid very long execution
                start = System.currentTimeMillis();
                int r = fibonacciRecursive(n);
                end = System.currentTimeMillis();
                System.out.println("Recursive Result: " + r);
                System.out.println("Recursive Time: " + (end - start) + " ms");
            } else {
                System.out.println("Recursive Result: Not feasible for large N");
            }

            // Iterative
            start = System.currentTimeMillis();
            int i = fibonacciIterative(n);
            end = System.currentTimeMillis();
            System.out.println("Iterative Result: " + i);
            System.out.println("Iterative Time: " + (end - start) + " ms");
        }
    }
}

