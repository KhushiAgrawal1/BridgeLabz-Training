package com.objectmodeling;

public class Student1 {
    String name;

    Student1(String name) {
        this.name = name;
    }

    void enrollCourse(Course1 course) {
        System.out.println(name + " enrolled in " + course.courseName);
    }
}

