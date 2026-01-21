package com.collections.map_interface;

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {

    static Map<String, List<Employee>> groupByDept(List<Employee> employees) {
        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {
            map.computeIfAbsent(e.department, k -> new ArrayList<>())
               .add(e);
        }
        return map;
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> result = groupByDept(employees);

        for (String dept : result.keySet()) {
            System.out.println(dept + ": " + result.get(dept));
        }
    }
}


