package com.encapsulation_polymorphism_interface_abstractclass.ecommercePlatform;

public class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}

