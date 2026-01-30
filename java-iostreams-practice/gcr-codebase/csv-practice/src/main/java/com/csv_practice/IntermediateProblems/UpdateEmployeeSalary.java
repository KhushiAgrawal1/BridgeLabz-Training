package com.csv_practice.IntermediateProblems;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class UpdateEmployeeSalary {

    public static void main(String[] args) {

        String inputFile = "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csv-practice\\src\\main\\java\\com\\csv_practice\\BasicProblems\\employees.csv";
        String outputFile = "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csv-practice\\src\\main\\java\\com\\csv_practice\\IntermediateProblems\\employees_updated.csv";

        try (
            CSVReader reader = new CSVReader(new FileReader(inputFile));
            CSVWriter writer = new CSVWriter(new FileWriter(outputFile))
        ) {

            String[] data;

            // Read and write header
            data = reader.readNext();
            writer.writeNext(data);

            while ((data = reader.readNext()) != null) {

                // Skip empty rows
                if (data.length == 0 || data[0].trim().isEmpty()) {
                    continue;
                }

                String department = data[2].trim();
                double salary = Double.parseDouble(data[3].trim());

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Update salary value
                data[3] = String.valueOf((int) salary);

                writer.writeNext(data);
            }

            System.out.println("Salary updated successfully!");
            System.out.println("Updated file created: " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

