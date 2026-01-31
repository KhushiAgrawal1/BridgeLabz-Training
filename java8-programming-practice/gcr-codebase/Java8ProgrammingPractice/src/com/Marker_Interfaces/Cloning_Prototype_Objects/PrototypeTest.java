package com.Marker_Interfaces.Cloning_Prototype_Objects;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Prototype original = new Prototype(1, "Original Object");

        Prototype copy = (Prototype) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Cloned: " + copy);
    }
}
