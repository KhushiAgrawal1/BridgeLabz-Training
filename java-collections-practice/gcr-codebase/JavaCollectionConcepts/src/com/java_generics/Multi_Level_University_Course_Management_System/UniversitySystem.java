package com.java_generics.Multi_Level_University_Course_Management_System;

import java.util.*;

public class UniversitySystem {
    public static void main(String[] args) {

        Course<ExamCourse> javaCourse =
                new Course<>("Java Programming", "Computer Science", new ExamCourse());

        Course<AssignmentCourse> designCourse =
                new Course<>("UI Design", "Design", new AssignmentCourse());

        Course<ResearchCourse> aiCourse =
                new Course<>("AI Research", "Computer Science", new ResearchCourse());

        System.out.println("---- Course Details ----");
        javaCourse.displayCourseDetails();
        System.out.println();
        designCourse.displayCourseDetails();
        System.out.println();
        aiCourse.displayCourseDetails();

        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse());
        courseTypes.add(new AssignmentCourse());
        courseTypes.add(new ResearchCourse());

        System.out.println("\n---- Display Using Wildcards ----");
        CourseUtility.displayAllCourses(courseTypes);
    }
}

