package com.inheritance.multilevelinheritance.CourseHierarchyDemo;

public class CourseHierarchyDemo {
    public static void main(String[] args) {

        PaidOnlineCourse course =
                new PaidOnlineCourse("Java Programming", 40,
                        "Udemy", true, 5000, 20);

        course.displayPaidCourse();
    }
}
