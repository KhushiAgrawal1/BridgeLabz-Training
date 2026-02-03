package com.Collectors.Employee_Salary_Categorization;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {
	public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", "IT", 50000),
                new Employee("Neha", "IT", 60000),
                new Employee("Aman", "HR", 40000),
                new Employee("Riya", "HR", 50000),
                new Employee("Karan", "Sales", 45000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                emp -> emp.department,                 // group by department
                                Collectors.averagingDouble(
                                        emp -> emp.salary               // average salary
                                )
                        ));

        System.out.println(avgSalaryByDept);
    }

}
