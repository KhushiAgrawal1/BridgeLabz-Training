package com.reflection.basic_level.DynamicallyCreateObjects;

public class Student {

    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display student info
    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}
