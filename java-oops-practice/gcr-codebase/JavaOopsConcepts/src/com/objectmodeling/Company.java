package com.objectmodeling;

import java.util.ArrayList;

public class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            System.out.println(" Department: " + d.deptName);
            for (Employee e : d.employees) {
                System.out.println("  Employee: " + e.empName);
            }
        }
    }
}

