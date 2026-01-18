package com.java_generics.AI_Driven_Resume_Screening_System;

import java.util.*;

class ScreeningUtility {

    // Generic method
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("AI Screening in progress...");
        resume.processResume();
        System.out.println("Resume screened successfully ✔\n");
    }

    // Wildcard method
    public static void screenMultipleRoles(List<? extends JobRole> roles) {
        System.out.println("---- Screening Pipeline ----");
        for (JobRole role : roles) {
            System.out.print(role.roleName + ": ");
            role.evaluateResume();
        }
    }
}
