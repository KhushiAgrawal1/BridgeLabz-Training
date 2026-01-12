package com.AmbulanceRoute_Emergency_Patient_Navigation;

import java.util.*;

public class AmbulanceRoute {

    private HospitalUnit head; // start of circular linked list
    private Scanner sc;

    public AmbulanceRoute() {
        head = null;
        sc = new Scanner(System.in);
    }

    // Add hospital unit in circular list
    public void addUnit(String name) {
        HospitalUnit newUnit = new HospitalUnit(name);
        if (head == null) {
            head = newUnit;
            head.next = head; // circular
        } else {
            HospitalUnit temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newUnit;
            newUnit.next = head; // maintain circular link
        }
        System.out.println("Added hospital unit: " + name);
    }

    // Display all units
    public void displayUnits() {
        if (head == null) {
            System.out.println("No units in the hospital.");
            return;
        }

        System.out.println("\nHospital Units:");
        HospitalUnit temp = head;
        do {
            System.out.println(" - " + temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Find nearest available unit for patient
    public void navigatePatient() {
        if (head == null) {
            System.out.println("No units available.");
            return;
        }

        System.out.print("Enter patient ID/name: ");
        String patient = sc.nextLine();

        HospitalUnit temp = head;
        boolean found = false;
        do {
            if (temp.available) {
                System.out.println("Patient " + patient + " assigned to unit: " + temp.name);
                found = true;
                break;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No available units for patient " + patient + ".");
        }
    }

    // Remove a unit under maintenance
    public void removeUnit() {
        if (head == null) {
            System.out.println("No units to remove.");
            return;
        }

        System.out.print("Enter unit name to remove (under maintenance): ");
        String name = sc.nextLine();

        HospitalUnit curr = head;
        HospitalUnit prev = null;
        boolean found = false;

        do {
            if (curr.name.equalsIgnoreCase(name)) {
                found = true;
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        if (!found) {
            System.out.println("Unit not found.");
            return;
        }

        // If only one unit
        if (curr.next == curr) {
            head = null;
        } else {
            if (curr == head) { // remove head
                HospitalUnit temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            } else {
                prev.next = curr.next;
            }
        }

        System.out.println("Removed unit: " + name);
    }

    // Mark a unit under maintenance
    public void markMaintenance() {
        if (head == null) {
            System.out.println("No units available.");
            return;
        }

        System.out.print("Enter unit name to mark under maintenance: ");
        String name = sc.nextLine();

        HospitalUnit temp = head;
        boolean found = false;
        do {
            if (temp.name.equalsIgnoreCase(name)) {
                temp.available = false;
                System.out.println("Unit " + name + " is now under maintenance.");
                found = true;
                break;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("Unit not found.");
        }
    }

    // Menu-driven user interface
    public void menu() {
        while (true) {
            System.out.println("\nAmbulanceRoute Menu:");
            System.out.println("1. Add Hospital Unit");
            System.out.println("2. Display Units");
            System.out.println("3. Assign Patient to Unit");
            System.out.println("4. Remove Unit (Under Maintenance)");
            System.out.println("5. Mark Unit Under Maintenance");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter unit name: ");
                    String name = sc.nextLine();
                    addUnit(name);
                }
                case 2 -> displayUnits();
                case 3 -> navigatePatient();
                case 4 -> removeUnit();
                case 5 -> markMaintenance();
                case 6 -> {
                    System.out.println("Exiting AmbulanceRoute...");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        AmbulanceRoute route = new AmbulanceRoute();

        // Adding default circular hospital units
        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");

        route.menu();
    }
}

