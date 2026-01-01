package com.encapsulation_polymorphism_interface_abstractclass.ecommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {

    public static void printFinalPrice(Product product) {
        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: ₹" + product.getPrice());

        if (product instanceof Taxable) {
            System.out.println(((Taxable) product).getTaxDetails());
        }

        System.out.println("Discount: ₹" + product.calculateDiscount());
        System.out.println("Final Price: ₹" + product.getFinalPrice());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice", 1200));

        // Polymorphism
        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}

