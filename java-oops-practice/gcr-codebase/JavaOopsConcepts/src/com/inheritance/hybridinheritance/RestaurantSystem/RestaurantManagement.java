package com.inheritance.hybridinheritance.RestaurantSystem;

public class RestaurantManagement {
    public static void main(String[] args) {

        Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Amit", 102);

        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
