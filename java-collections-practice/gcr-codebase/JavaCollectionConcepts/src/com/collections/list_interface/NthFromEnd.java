package com.collections.list_interface;

import java.util.*;

public class NthFromEnd {

    static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext())
                fast.next();
            else
                return null;
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> letters = new LinkedList<>(
                Arrays.asList("A", "B", "C", "D", "E")
        );

        String result = findNthFromEnd(letters, 2);
        System.out.println("Nth element from end: " + result);
    }
}

