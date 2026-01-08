package com.Hospital_Patient_Management_System;

public class Patient {
    protected int id;
    protected String name;
    private String medicalHistory;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Patient(int id, String name, String medicalHistory) {
        this(id, name);
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "ID: " + id + ", Name: " + name;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}

