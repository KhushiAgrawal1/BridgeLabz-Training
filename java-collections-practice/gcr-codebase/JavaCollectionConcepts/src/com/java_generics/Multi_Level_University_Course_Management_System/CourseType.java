package com.java_generics.Multi_Level_University_Course_Management_System;

abstract class CourseType {
    protected String evaluationType;

    public CourseType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    public abstract void displayEvaluation();
}

