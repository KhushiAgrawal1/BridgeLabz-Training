package com.encapsulation_polymorphism_interface_abstractclass.employeeManagementSystem;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, double fixedSalary) {
        super(employeeId, name, fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // fixed salary
    }
}
