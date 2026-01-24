package com.streams.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    String department;
    double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }
}

