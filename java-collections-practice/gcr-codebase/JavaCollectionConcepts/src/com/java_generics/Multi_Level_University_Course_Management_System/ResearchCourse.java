package com.java_generics.Multi_Level_University_Course_Management_System;

class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research Based");
    }

    @Override
    public void displayEvaluation() {
        System.out.println("Evaluation Method: " + evaluationType);
    }
}

