package com.TrainCompanion_Compartment_Navigation_System;

import java.util.Scanner;

public class TrainCompanion {

    private Compartment head;
    private Compartment current;
    private Scanner sc;

    public TrainCompanion() {
        head = null;
        current = null;
        sc = new Scanner(System.in);
    }

    // Add a compartment at the end
    public void addCompartment() {
        System.out.print("Enter compartment name: ");
        String name = sc.nextLine();

        System.out.print("Enter service in compartment: ");
        String service = sc.nextLine();

        Compartment newComp = new Compartment(name, service);

        if (head == null) {
            head = newComp;
            current = head;
        } else {
            Compartment temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newComp;
            newComp.prev = temp;
        }

        System.out.println("Added compartment: " + newComp);
    }

    // Remove a compartment by name
    public void removeCompartment() {
        if (head == null) {
            System.out.println("No compartments to remove.");
            return;
        }

        System.out.print("Enter compartment name to remove: ");
        String name = sc.nextLine();

        Compartment temp = head;
        while (temp != null && !temp.name.equalsIgnoreCase(name)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Compartment not found.");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next; // removing head
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (current == temp) {
            current = (temp.next != null) ? temp.next : temp.prev;
        }

        System.out.println("Removed compartment: " + temp);
    }

    // Move to next compartment
    public void moveForward() {
        if (current == null || current.next == null) {
            System.out.println("Cannot move forward. You are at the last compartment.");
        } else {
            current = current.next;
            displayCurrentAndAdjacent();
        }
    }

    // Move to previous compartment
    public void moveBackward() {
        if (current == null || current.prev == null) {
            System.out.println("Cannot move backward. You are at the first compartment.");
        } else {
            current = current.prev;
            displayCurrentAndAdjacent();
        }
    }

    // Display current and adjacent compartments
    public void displayCurrentAndAdjacent() {
        if (current == null) {
            System.out.println("No compartments available.");
            return;
        }

        System.out.println("\nCurrent compartment: " + current);

        if (current.prev != null) {
            System.out.println("Previous compartment: " + current.prev);
        } else {
            System.out.println("No previous compartment.");
        }

        if (current.next != null) {
            System.out.println("Next compartment: " + current.next);
        } else {
            System.out.println("No next compartment.");
        }
    }

    // Display all compartments
    public void displayAll() {
        if (head == null) {
            System.out.println("No compartments added.");
            return;
        }

        System.out.println("\nTrain Compartments:");
        Compartment temp = head;
        while (temp != null) {
            System.out.println(" - " + temp);
            temp = temp.next;
        }
    }

    // Menu-driven interface
    public void menu() {
        while (true) {
            System.out.println("\nTrainCompanion Menu:");
            System.out.println("1. Add Compartment");
            System.out.println("2. Remove Compartment");
            System.out.println("3. Move Forward");
            System.out.println("4. Move Backward");
            System.out.println("5. Display Current & Adjacent Compartments");
            System.out.println("6. Display All Compartments");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addCompartment();
                case 2 -> removeCompartment();
                case 3 -> moveForward();
                case 4 -> moveBackward();
                case 5 -> displayCurrentAndAdjacent();
                case 6 -> displayAll();
                case 7 -> {
                    System.out.println("Exiting TrainCompanion...");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        TrainCompanion train = new TrainCompanion();

        // Add some default compartments
        train.addCompartment("Compartment 1", "Sleeper");
        train.addCompartment("Compartment 2", "AC");
        train.addCompartment("Compartment 3", "Pantry");

        train.menu();
    }

    // Overloaded addCompartment for default setup
    private void addCompartment(String name, String service) {
        Compartment newComp = new Compartment(name, service);
        if (head == null) {
            head = newComp;
            current = head;
        } else {
            Compartment temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newComp;
            newComp.prev = temp;
        }
    }
}

