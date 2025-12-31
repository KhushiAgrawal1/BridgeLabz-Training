package com.inheritance.hierarchicalinheritance.SchoolSystemWithDifferentRoles;

public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        displayPersonDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}
