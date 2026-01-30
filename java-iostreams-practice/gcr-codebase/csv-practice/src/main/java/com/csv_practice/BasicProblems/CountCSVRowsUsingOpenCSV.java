package com.csv_practice.BasicProblems;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class CountCSVRowsUsingOpenCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csv-practice\\src\\main\\java\\com\\csv_practice\\BasicProblems\\employees.csv";
        int count = 0;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            reader.readNext(); // skip header

            while (reader.readNext() != null) {
                count++;
            }

            System.out.println("Total number of records (excluding header): " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

