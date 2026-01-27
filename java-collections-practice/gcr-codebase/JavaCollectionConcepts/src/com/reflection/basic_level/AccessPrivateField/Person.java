package com.reflection.basic_level.AccessPrivateField;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    // Optional getter for verification
    public int getAge() {
        return age;
    }
}
