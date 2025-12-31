package com.inheritance.multilevelinheritance.CourseHierarchyDemo;

public class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration,
                        String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayOnlineCourse() {
        displayCourse();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

