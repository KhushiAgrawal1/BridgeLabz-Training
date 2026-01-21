package com.collections.Banking_System;

import java.util.*;

class WithdrawalRequest {
    int accountNumber;
    int amount;

    WithdrawalRequest(int accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

public class BankingSystem {

    // AccountNumber -> Balance
    static HashMap<Integer, Integer> accounts = new HashMap<>();

    // Queue for withdrawal requests
    static Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    public static void main(String[] args) {

        // Creating bank accounts
        accounts.put(1001, 5000);
        accounts.put(1002, 12000);
        accounts.put(1003, 8000);

        // Adding withdrawal requests
        withdrawalQueue.add(new WithdrawalRequest(1001, 2000));
        withdrawalQueue.add(new WithdrawalRequest(1003, 3000));
        withdrawalQueue.add(new WithdrawalRequest(1002, 5000));

        // Process withdrawals
        processWithdrawals();

        // Display sorted customers by balance
        displaySortedByBalance();
    }

    // Process withdrawal requests using Queue
    static void processWithdrawals() {
        System.out.println("🔁 Processing Withdrawals:");

        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();

            int balance = accounts.getOrDefault(request.accountNumber, 0);

            if (balance >= request.amount) {
                accounts.put(request.accountNumber, balance - request.amount);
                System.out.println("Withdrawal Successful → Account "
                        + request.accountNumber + " New Balance: ₹"
                        + accounts.get(request.accountNumber));
            } else {
                System.out.println("Insufficient Balance → Account "
                        + request.accountNumber);
            }
        }
    }

    // Sort customers by balance using TreeMap
    static void displaySortedByBalance() {

        // Balance -> List of Account Numbers
        TreeMap<Integer, List<Integer>> sortedMap = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accounts.entrySet()) {
            sortedMap
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        System.out.println("\n📊 Customers Sorted by Balance:");

        for (Map.Entry<Integer, List<Integer>> entry : sortedMap.entrySet()) {
            for (Integer acc : entry.getValue()) {
                System.out.println("Account " + acc + " → Balance: ₹" + entry.getKey());
            }
        }
    }
}

