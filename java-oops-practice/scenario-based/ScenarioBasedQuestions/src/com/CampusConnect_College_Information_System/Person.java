package com.CampusConnect_College_Information_System;

public class Person {
    protected int id;
    protected String name;
    protected String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void printDetails() {
        System.out.println(name + " (" + email + ")");
    }
}
