package com.encapsulation_polymorphism_interface_abstractclass.employeeManagementSystem;

import com.encapsulation.EmployeeManagementSystem.Employee;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, int hoursWorked, double hourlyRate) {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
