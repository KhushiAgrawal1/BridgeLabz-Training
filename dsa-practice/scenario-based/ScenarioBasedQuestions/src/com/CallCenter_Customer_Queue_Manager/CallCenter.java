package com.CallCenter_Customer_Queue_Manager;

import java.util.*;

public class CallCenter {

    private Queue<Customer> normalQueue; // normal customers
    private PriorityQueue<Customer> vipQueue; // VIP customers
    private HashMap<String, Integer> callCount; // number of calls per customer
    private Scanner sc;

    public CallCenter() {
        normalQueue = new LinkedList<>();
        vipQueue = new PriorityQueue<>(Comparator.comparing(c -> c.name)); // simple VIP ordering by name
        callCount = new HashMap<>();
        sc = new Scanner(System.in);
    }

    // Add a customer call
    public void addCall() {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Is this customer VIP? (yes/no): ");
        String vipInput = sc.nextLine();
        boolean isVIP = vipInput.equalsIgnoreCase("yes");

        Customer customer = new Customer(name, isVIP);

        if (isVIP) {
            vipQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }

        callCount.put(name, callCount.getOrDefault(name, 0) + 1);
        System.out.println("Call added for " + customer);
    }

    // Serve next call
    public void serveCall() {
        Customer nextCustomer;

        if (!vipQueue.isEmpty()) {
            nextCustomer = vipQueue.poll();
            System.out.println("Serving VIP customer: " + nextCustomer);
        } else if (!normalQueue.isEmpty()) {
            nextCustomer = normalQueue.poll();
            System.out.println("Serving customer: " + nextCustomer);
        } else {
            System.out.println("No customers in the queue.");
        }
    }

    // Display call statistics
    public void displayCallStats() {
        System.out.println("\nCall Statistics:");
        for (Map.Entry<String, Integer> entry : callCount.entrySet()) {
            System.out.println("Customer: " + entry.getKey() + " | Calls this month: " + entry.getValue());
        }
    }

    // Display current queues
    public void displayQueues() {
        System.out.println("\nVIP Queue:");
        if (vipQueue.isEmpty()) System.out.println("Empty");
        else vipQueue.forEach(System.out::println);

        System.out.println("Normal Queue:");
        if (normalQueue.isEmpty()) System.out.println("Empty");
        else normalQueue.forEach(System.out::println);
    }

    // User menu
    public void menu() {
        while (true) {
            System.out.println("\nCallCenter Menu:");
            System.out.println("1. Add Call");
            System.out.println("2. Serve Next Call");
            System.out.println("3. Display Queues");
            System.out.println("4. Display Call Stats");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addCall();
                case 2 -> serveCall();
                case 3 -> displayQueues();
                case 4 -> displayCallStats();
                case 5 -> {
                    System.out.println("Exiting CallCenter...");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        CallCenter center = new CallCenter();
        center.menu();
    }
}

