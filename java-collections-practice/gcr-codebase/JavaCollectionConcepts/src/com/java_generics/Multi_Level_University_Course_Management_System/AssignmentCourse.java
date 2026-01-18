package com.java_generics.Multi_Level_University_Course_Management_System;

class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignment Based");
    }

    @Override
    public void displayEvaluation() {
        System.out.println("Evaluation Method: " + evaluationType);
    }
}

