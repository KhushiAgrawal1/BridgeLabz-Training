package com.objectmodeling;

public class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignProfessor(Course1 course) {
        System.out.println(name + " teaches " + course.courseName);
    }
}

