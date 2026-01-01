package com.encapsulation_polymorphism_interface_abstractclass.OnlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {

    public static void processOrder(List<FoodItem> items) {

        double grandTotal = 0;

        for (FoodItem item : items) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice = total - discount;
            grandTotal += finalPrice;

            System.out.println("Total Price: ₹" + total);
            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("------------------------");
        }

        System.out.println("Grand Total Bill: ₹" + grandTotal);
    }

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        // Polymorphism
        processOrder(order);
    }
}

