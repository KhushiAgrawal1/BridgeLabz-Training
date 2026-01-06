package Linked_List.Singly_Linked_List.Inventory_Management_System;

public class InventoryManagementSystem {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtBeginning(101, "Keyboard", 10, 500);
        inventory.addAtEnd(102, "Mouse", 20, 300);
        inventory.addAtEnd(103, "Monitor", 5, 8000);
        inventory.addAtPosition(2, 104, "CPU", 3, 25000);

        System.out.println("Inventory:");
        inventory.display();

        System.out.println("\nSearch by ID:");
        inventory.searchById(102);

        System.out.println("\nUpdate Quantity:");
        inventory.updateQuantity(103, 8);

        System.out.println("\nTotal Value:");
        inventory.totalInventoryValue();

        System.out.println("\nSort by Name (Ascending):");
        inventory.sortByName(true);
        inventory.display();

        System.out.println("\nSort by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.display();
    }
}
