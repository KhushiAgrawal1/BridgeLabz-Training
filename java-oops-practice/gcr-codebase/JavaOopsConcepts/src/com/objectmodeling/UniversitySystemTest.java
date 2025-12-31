package com.objectmodeling;

public class UniversitySystemTest {
    public static void main(String[] args) {

        Student1 s1 = new Student1("Khushi");
        Professor p1 = new Professor("Dr. Mehta");
        Course1 c1 = new Course1("Java");

        s1.enrollCourse(c1);
        p1.assignProfessor(c1);
    }
}

