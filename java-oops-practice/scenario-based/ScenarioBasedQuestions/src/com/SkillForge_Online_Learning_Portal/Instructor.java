package com.SkillForge_Online_Learning_Portal;

public class Instructor extends User implements ICertifiable {

    public Instructor(String name, String email) {
        super(name, email);
    }

    // Polymorphism: different certificate format for instructor
    @Override
    public void generateCertificate() {
        System.out.println("Instructor certificate issued for " + getName());
    }

    // Additional feature: create course
    public Course createCourse(String title, String[] modules) {
        Course newCourse = new Course(title, getName(), modules);
        System.out.println(getName() + " created course: " + title);
        return newCourse;
    }
}
