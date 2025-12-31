package com.objectmodeling;

public class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        System.out.println("Dr. " + name + " consulting patient " + patient.name);
    }
}
