package com.collections.Insurance_Policy_Management_System;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {

    public static void main(String[] args) {

        // 1️⃣ Store policies using different Sets
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        Policy p1 = new Policy(101, "Alice",
                LocalDate.now().plusDays(20), "Health", 12000);

        Policy p2 = new Policy(102, "Bob",
                LocalDate.now().plusDays(60), "Auto", 8000);

        Policy p3 = new Policy(103, "Carol",
                LocalDate.now().plusDays(10), "Home", 15000);

        Policy p4 = new Policy(101, "Alice Duplicate",
                LocalDate.now().plusDays(20), "Health", 12000); // duplicate

        // Add policies
        Collections.addAll(hashSet, p1, p2, p3, p4);
        Collections.addAll(linkedHashSet, p1, p2, p3, p4);
        Collections.addAll(treeSet, p1, p2, p3, p4);

        // 2️⃣ Retrieve Policies

        System.out.println("\n🔹 All Unique Policies (HashSet):");
        hashSet.forEach(System.out::println);

        System.out.println("\n🔹 Policies in Insertion Order (LinkedHashSet):");
        linkedHashSet.forEach(System.out::println);

        System.out.println("\n🔹 Policies Sorted by Expiry Date (TreeSet):");
        treeSet.forEach(System.out::println);

        // Policies expiring within next 30 days
        System.out.println("\n🔹 Policies Expiring in Next 30 Days:");
        LocalDate today = LocalDate.now();
        for (Policy p : hashSet) {
            if (!p.expiryDate.isAfter(today.plusDays(30))) {
                System.out.println(p);
            }
        }

        // Policies by coverage type
        System.out.println("\n🔹 Health Insurance Policies:");
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase("Health")) {
                System.out.println(p);
            }
        }

        // Duplicate policies detection
        System.out.println("\n🔹 Duplicate Policies (by Policy Number):");
        Set<Integer> policyNumbers = new HashSet<>();
        for (Policy p : Arrays.asList(p1, p2, p3, p4)) {
            if (!policyNumbers.add(p.policyNumber)) {
                System.out.println("Duplicate Found: " + p.policyNumber);
            }
        }

        // 3️⃣ Performance Comparison
        performanceTest();
    }

    // Performance testing
    static void performanceTest() {

        int size = 100000;

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        // Add
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) hashSet.add(i);
        System.out.println("\nHashSet Add Time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) linkedHashSet.add(i);
        System.out.println("LinkedHashSet Add Time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) treeSet.add(i);
        System.out.println("TreeSet Add Time: " + (System.currentTimeMillis() - start));

        // Search
        start = System.currentTimeMillis();
        hashSet.contains(size - 1);
        System.out.println("\nHashSet Search Time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        linkedHashSet.contains(size - 1);
        System.out.println("LinkedHashSet Search Time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        treeSet.contains(size - 1);
        System.out.println("TreeSet Search Time: " + (System.currentTimeMillis() - start));
    }
}

