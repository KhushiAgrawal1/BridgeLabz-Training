package com.objectmodeling;

public class UniversityTest {
    public static void main(String[] args) {

        University uni = new University("Global University");

        Department1 d1 = new Department1("CSE");
        Faculty f1 = new Faculty("Dr. Sharma");

        uni.addDepartment(d1);
        uni.addFaculty(f1);

        uni = null; // departments destroyed (composition)
        // faculty can exist independently
    }
}

