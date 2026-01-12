package com.SkillForge_Online_Learning_Portal;

public class Student extends User implements ICertifiable {
    private double progress; // percentage of course completed
    private Course enrolledCourse;

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0.0;
        this.enrolledCourse = null;
    }

    public void enrollCourse(Course course) {
        this.enrolledCourse = course;
        System.out.println(getName() + " enrolled in course: " + course.getTitle());
    }

    public void completeModule() {
        if(enrolledCourse != null) {
            progress += 100.0 / enrolledCourse.getModules().length;
            if(progress > 100) progress = 100;
            System.out.println(getName() + " completed a module. Progress: " + progress + "%");
        } else {
            System.out.println("No course enrolled.");
        }
    }

    // Polymorphism: different certificate format for student
    @Override
    public void generateCertificate() {
        if(progress >= 100) {
            System.out.println("Generating certificate for " + getName() + " in course: " 
                + enrolledCourse.getTitle() + " [Student Certificate]");
        } else {
            System.out.println(getName() + " has not completed the course yet.");
        }
    }
}

