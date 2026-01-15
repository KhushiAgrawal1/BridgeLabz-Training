package com.java_generics.Smart_Warehouse_Management_System;

import java.util.List;

public class SmartWarehouse {

    // Wildcard method
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getCategory() + " : " + item.getName());
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Camera"));

        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Oil"));

        System.out.println("Electronics Section:");
        displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Section:");
        displayItems(groceriesStorage.getItems());
    }
}

