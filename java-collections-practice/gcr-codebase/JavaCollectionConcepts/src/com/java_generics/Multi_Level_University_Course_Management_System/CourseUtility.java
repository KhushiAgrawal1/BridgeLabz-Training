package com.java_generics.Multi_Level_University_Course_Management_System;

import java.util.*;

class CourseUtility {

    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType courseType : courses) {
            courseType.displayEvaluation();
        }
    }
}
