package com.encapsulation_polymorphism_interface_abstractclass.employeeManagementSystem;


import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee(101, "Amit", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Neha", 80, 500);

        emp1.assignDepartment("IT");
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        // Polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}


