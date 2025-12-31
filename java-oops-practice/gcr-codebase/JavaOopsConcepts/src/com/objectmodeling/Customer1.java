package com.objectmodeling;

public class Customer1 {
    String name;

    Customer1(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        System.out.println(name + " placed an order");
    }
}

