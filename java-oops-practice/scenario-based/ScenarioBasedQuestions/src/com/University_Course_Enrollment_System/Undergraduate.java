package com.University_Course_Enrollment_System;

public class Undergraduate extends Student implements Graded {

    public Undergraduate(int roll, String name) {
        super(roll, name);
    }

    public void assignGrade(int marks) {
        setGPA(marks / 25.0);
    }
}

