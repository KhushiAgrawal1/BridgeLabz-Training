package com.CampusConnect_College_Information_System;

public class Student extends Person {

    private int totalMarks;
    private int subjectCount;

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    public void addMarks(int marks) {
        totalMarks += marks;
        subjectCount++;
    }

    public double calculateGPA() {
        return (double) totalMarks / subjectCount / 10; // operator usage
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + name + ", GPA: " + calculateGPA());
    }
}

