package com.objectmodeling;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + "'s courses:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

