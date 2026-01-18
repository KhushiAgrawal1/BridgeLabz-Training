package com.java_generics.AI_Driven_Resume_Screening_System;

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Candidate: " + candidateName +
                " | Role Applied: " + jobRole.roleName);
        jobRole.evaluateResume();
    }

    public T getJobRole() {
        return jobRole;
    }
}

