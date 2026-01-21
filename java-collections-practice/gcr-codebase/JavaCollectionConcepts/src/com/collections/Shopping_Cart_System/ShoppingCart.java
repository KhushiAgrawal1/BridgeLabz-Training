package com.collections.Shopping_Cart_System;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        // 1️⃣ HashMap: Product -> Price (Fast access)
        HashMap<String, Integer> priceMap = new HashMap<>();

        // 2️⃣ LinkedHashMap: Maintains insertion order
        LinkedHashMap<String, Integer> cartOrder = new LinkedHashMap<>();

        // Adding products to cart
        addItem("Laptop", 55000, priceMap, cartOrder);
        addItem("Mouse", 800, priceMap, cartOrder);
        addItem("Keyboard", 1500, priceMap, cartOrder);
        addItem("Headphones", 2500, priceMap, cartOrder);

        // Display cart items in order added
        System.out.println("🧾 Cart Items (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cartOrder.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
        }

        // 3️⃣ TreeMap: Sort items by price
        TreeMap<Integer, List<String>> sortedByPrice = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : priceMap.entrySet()) {
            sortedByPrice
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        System.out.println("\n📊 Cart Items (Sorted by Price):");
        for (Map.Entry<Integer, List<String>> entry : sortedByPrice.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " : ₹" + entry.getKey());
            }
        }
    }

    // Method to add item
    static void addItem(String product, int price,
                        HashMap<String, Integer> priceMap,
                        LinkedHashMap<String, Integer> cartOrder) {

        priceMap.put(product, price);
        cartOrder.put(product, price);
    }
}

