package com.RuntimeAnalysisAndBigONotation;

public class StringConcatenationPerformance {

    // ---------- Using String ----------
    static void useString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "a";   // creates new object every time
        }
    }

    // ---------- Using StringBuilder ----------
    static void useStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");   // mutable, fast
        }
    }

    // ---------- Using StringBuffer ----------
    static void useStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");   // thread-safe, slower than StringBuilder
        }
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        for (int n : sizes) {
            System.out.println("\nOperations Count: " + n);

            long start, end;

            // String
            start = System.currentTimeMillis();
            useString(n);
            end = System.currentTimeMillis();
            System.out.println("String Time: " + (end - start) + " ms");

            // StringBuilder
            start = System.currentTimeMillis();
            useStringBuilder(n);
            end = System.currentTimeMillis();
            System.out.println("StringBuilder Time: " + (end - start) + " ms");

            // StringBuffer
            start = System.currentTimeMillis();
            useStringBuffer(n);
            end = System.currentTimeMillis();
            System.out.println("StringBuffer Time: " + (end - start) + " ms");
        }
    }
}

