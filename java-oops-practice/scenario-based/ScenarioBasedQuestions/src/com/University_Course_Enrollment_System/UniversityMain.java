package com.University_Course_Enrollment_System;

public class UniversityMain {
    public static void main(String[] args) {
        Graded s = new Undergraduate(1, "Aman");
        s.assignGrade(80);
        ((Student) s).showTranscript();
    }
}

