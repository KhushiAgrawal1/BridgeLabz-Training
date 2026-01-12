package com.TrainCompanion_Compartment_Navigation_System;

public class Compartment {
    String name;
    String service; // e.g., Pantry, WiFi, Sleeper, AC
    Compartment prev;
    Compartment next;

    public Compartment(String name, String service) {
        this.name = name;
        this.service = service;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return name + " [" + service + "]";
    }
}

