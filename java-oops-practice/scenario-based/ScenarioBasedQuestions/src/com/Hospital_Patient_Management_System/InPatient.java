package com.Hospital_Patient_Management_System;

public class InPatient extends Patient {

    public InPatient(int id, String name, String history) {
        super(id, name, history);
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient → " + getSummary());
    }
}

