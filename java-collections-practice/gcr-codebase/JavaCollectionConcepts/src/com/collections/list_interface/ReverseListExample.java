package com.collections.list_interface;

import java.util.*;

public class ReverseListExample {

    // Reverse ArrayList
    static void reverseArrayList(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    // Reverse LinkedList
    static void reverseLinkedList(LinkedList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> linkList = new LinkedList<>(arrList);

        reverseArrayList(arrList);
        reverseLinkedList(linkList);

        System.out.println("Reversed ArrayList: " + arrList);
        System.out.println("Reversed LinkedList: " + linkList);
    }
}

