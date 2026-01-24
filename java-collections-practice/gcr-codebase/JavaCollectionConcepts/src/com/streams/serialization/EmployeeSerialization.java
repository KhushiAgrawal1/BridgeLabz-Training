package com.streams.serialization;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {

    public static void main(String[] args) {

        String fileName = "employees.dat";

        // --------- Create Employee List ----------
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "Amit", "IT", 55000));
        empList.add(new Employee(2, "Neha", "HR", 48000));
        empList.add(new Employee(3, "Rahul", "Finance", 60000));

        // --------- Serialization ----------
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(empList);
            System.out.println("Employees serialized successfully!");

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        // --------- Deserialization ----------
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            List<Employee> readList = (List<Employee>) ois.readObject();

            System.out.println("\n--- Employee Data from File ---");
            for (Employee emp : readList) {
                emp.display();
            }

        } catch (IOException e) {
            System.out.println("Deserialization IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Error: " + e.getMessage());
        }
    }
}
