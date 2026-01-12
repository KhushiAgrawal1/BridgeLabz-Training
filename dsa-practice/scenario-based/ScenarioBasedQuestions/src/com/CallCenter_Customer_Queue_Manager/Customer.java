package com.CallCenter_Customer_Queue_Manager;

public class Customer {
    String name;
    boolean isVIP;

    public Customer(String name, boolean isVIP) {
        this.name = name;
        this.isVIP = isVIP;
    }

    @Override
    public String toString() {
        return name + (isVIP ? " (VIP)" : "");
    }
}

