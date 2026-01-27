package com.reflection.advanced_level.CreateaCustomObjectMapper;

public class Person {
    private String name;
    private int age;
    private boolean active;

    public Person() {
        // Default constructor is required
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", active=" + active + "}";
    }
}

