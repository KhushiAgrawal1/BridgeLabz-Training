package com.objectmodeling;

import java.util.ArrayList;

public class University {
    String universityName;
    ArrayList<Department1> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String universityName) {
        this.universityName = universityName;
    }

    void addDepartment(Department1 d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }
}

