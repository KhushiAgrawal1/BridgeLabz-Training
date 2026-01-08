package com.University_Course_Enrollment_System;

public class Postgraduate extends Student implements Graded {

    public Postgraduate(int roll, String name) {
        super(roll, name);
    }

    public void assignGrade(int marks) {
        setGPA(marks / 20.0);
    }
}

