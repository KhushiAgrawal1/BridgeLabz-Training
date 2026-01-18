package com.java_generics.AI_Driven_Resume_Screening_System;

abstract class JobRole {
    protected String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public abstract void evaluateResume();
}

