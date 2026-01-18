package com.java_generics.AI_Driven_Resume_Screening_System;

import java.util.*;

public class ResumeScreeningSystem {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> resume1 =
                new Resume<>("Aman Sharma", new SoftwareEngineer());

        Resume<DataScientist> resume2 =
                new Resume<>("Neha Verma", new DataScientist());

        Resume<ProductManager> resume3 =
                new Resume<>("Rohit Mehta", new ProductManager());

        ScreeningUtility.screenResume(resume1);
        ScreeningUtility.screenResume(resume2);
        ScreeningUtility.screenResume(resume3);

        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(new SoftwareEngineer());
        jobRoles.add(new DataScientist());
        jobRoles.add(new ProductManager());

        ScreeningUtility.screenMultipleRoles(jobRoles);
    }
}
