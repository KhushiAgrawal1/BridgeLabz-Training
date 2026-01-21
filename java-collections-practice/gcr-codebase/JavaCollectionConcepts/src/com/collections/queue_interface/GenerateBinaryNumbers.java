package com.collections.queue_interface;

import java.util.*;

public class GenerateBinaryNumbers {

    static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 1; i <= n; i++) {
            String current = queue.remove();
            System.out.print(current + " ");

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateBinary(n);
    }
}

