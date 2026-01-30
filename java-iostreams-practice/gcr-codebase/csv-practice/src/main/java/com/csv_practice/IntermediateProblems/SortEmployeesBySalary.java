package com.csv_practice.IntermediateProblems;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csv-practice\\src\\main\\java\\com\\csv_practice\\BasicProblems\\employees.csv";
        List<String[]> employees = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            String[] data;
            reader.readNext(); // skip header

            while ((data = reader.readNext()) != null) {

                // Skip empty rows
                if (data.length == 0 || data[0].trim().isEmpty()) {
                    continue;
                }

                employees.add(data);
            }

            // Sort by Salary (descending)
            employees.sort((e1, e2) -> {
                int salary1 = Integer.parseInt(e1[3].trim());
                int salary2 = Integer.parseInt(e2[3].trim());
                return Integer.compare(salary2, salary1);
            });

            System.out.println("Top 5 Highest-Paid Employees:");
            System.out.println("--------------------------------");

            for (int i = 0; i < Math.min(5, employees.size()); i++) {
                String[] emp = employees.get(i);

                System.out.println("Name       : " + emp[1]);
                System.out.println("Department : " + emp[2]);
                System.out.println("Salary     : " + emp[3]);
                System.out.println("-------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

