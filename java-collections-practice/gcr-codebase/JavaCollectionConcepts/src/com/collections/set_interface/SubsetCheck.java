package com.collections.set_interface;

import java.util.*;

public class SubsetCheck {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean isSubset = set2.containsAll(set1);

        System.out.println("Is Set1 a subset of Set2? " + isSubset);
    }
}

