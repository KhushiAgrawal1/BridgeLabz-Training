package com.Marker_Interfaces.Cloning_Prototype_Objects;

class Prototype implements Cloneable {

    int id;
    String name;

    Prototype(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override clone() method
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();   // shallow copy
    }

    public String toString() {
        return "Prototype [id=" + id + ", name=" + name + "]";
    }
}

