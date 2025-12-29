package com.constructors.level1;

class Student {

    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double cgpa;

    // Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Setter for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}
