package com.collections.Insurance_Policy_Management_System_Using_Map_Interface;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {

    // 1️⃣ Map Implementations
    static Map<Integer, Policy> hashMap = new HashMap<>();
    static Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();
    static TreeMap<LocalDate, Policy> treeMap = new TreeMap<>();

    public static void main(String[] args) {

        // Adding policies
        addPolicy(new Policy(101, "Alice",
                LocalDate.now().plusDays(20), "Health", 12000));

        addPolicy(new Policy(102, "Bob",
                LocalDate.now().plusDays(60), "Auto", 8000));

        addPolicy(new Policy(103, "Alice",
                LocalDate.now().minusDays(5), "Home", 15000));

        // Retrieve by policy number
        System.out.println("\n🔹 Retrieve Policy 101:");
        System.out.println(getPolicyByNumber(101));

        // Policies expiring in next 30 days
        System.out.println("\n🔹 Policies Expiring in Next 30 Days:");
        listPoliciesExpiringSoon();

        // Policies by policyholder
        System.out.println("\n🔹 Policies for Alice:");
        listPoliciesByHolder("Alice");

        // Remove expired policies
        System.out.println("\n🔹 Removing Expired Policies...");
        removeExpiredPolicies();

        // Display remaining policies
        System.out.println("\n🔹 Remaining Policies:");
        hashMap.values().forEach(System.out::println);
    }

    // Add policy to all maps
    static void addPolicy(Policy policy) {
        hashMap.put(policy.policyNumber, policy);
        linkedHashMap.put(policy.policyNumber, policy);
        treeMap.put(policy.expiryDate, policy);
    }

    // 2️⃣ Retrieve a policy by number
    static Policy getPolicyByNumber(int policyNumber) {
        return hashMap.get(policyNumber);
    }

    // List policies expiring within next 30 days
    static void listPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Map.Entry<LocalDate, Policy> entry : treeMap.entrySet()) {
            if (!entry.getKey().isAfter(limit)) {
                System.out.println(entry.getValue());
            }
        }
    }

    // List policies by policyholder name
    static void listPoliciesByHolder(String holderName) {
        for (Policy policy : hashMap.values()) {
            if (policy.policyHolderName.equalsIgnoreCase(holderName)) {
                System.out.println(policy);
            }
        }
    }

    // Remove expired policies
    static void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<Integer, Policy>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.expiryDate.isBefore(today)) {
                iterator.remove();
                linkedHashMap.remove(policy.policyNumber);
                treeMap.remove(policy.expiryDate);
            }
        }
    }
}

