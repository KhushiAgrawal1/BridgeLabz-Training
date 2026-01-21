package com.collections.Voting_System;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        // 1️⃣ HashMap: Candidate -> Vote Count (Fast access)
        HashMap<String, Integer> voteCount = new HashMap<>();

        // 2️⃣ LinkedHashMap: Order in which votes are cast
        LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

        // Casting votes
        castVote("Alice", voteCount, voteOrder);
        castVote("Bob", voteCount, voteOrder);
        castVote("Alice", voteCount, voteOrder);
        castVote("Charlie", voteCount, voteOrder);
        castVote("Bob", voteCount, voteOrder);

        // Display vote order
        System.out.println("🗂 Vote Casting Order:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }

        // 3️⃣ TreeMap: Sorted results
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);

        System.out.println("\n📊 Final Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    // Method to cast vote
    static void castVote(String candidate,
                         HashMap<String, Integer> voteCount,
                         LinkedHashMap<String, Integer> voteOrder) {

        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCount.get(candidate));
    }
}

