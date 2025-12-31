package com.objectmodeling;

import java.util.ArrayList;

public class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }
}

