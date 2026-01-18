package com.java_generics.Multi_Level_University_Course_Management_System;

class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Exam Based");
    }

    @Override
    public void displayEvaluation() {
        System.out.println("Evaluation Method: " + evaluationType);
    }
}

