package com.java_generics.Multi_Level_University_Course_Management_System;

class Course<T extends CourseType> {
    private String courseName;
    private String department;
    private T courseType;

    public Course(String courseName, String department, T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName +
                " | Department: " + department);
        courseType.displayEvaluation();
    }

    public T getCourseType() {
        return courseType;
    }
}

