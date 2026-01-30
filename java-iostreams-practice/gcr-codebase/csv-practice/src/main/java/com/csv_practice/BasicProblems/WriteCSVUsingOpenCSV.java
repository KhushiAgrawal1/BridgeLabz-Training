package com.csv_practice.BasicProblems;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVUsingOpenCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csv-practice\\src\\main\\java\\com\\csv_practice\\BasicProblems\\employees.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {

            // Header
            String[] header = {"ID", "Name", "Department", "Salary"};
            writer.writeNext(header);

            // Records
            writer.writeNext(new String[]{"1", "Rahul Sharma", "IT", "55000"});
            writer.writeNext(new String[]{"2", "Priya Verma", "HR", "48000"});
            writer.writeNext(new String[]{"3", "Amit Kumar", "Finance", "60000"});
            writer.writeNext(new String[]{"4", "Neha Singh", "Marketing", "52000"});
            writer.writeNext(new String[]{"5", "Rohit Mehta", "Sales", "50000"});

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

