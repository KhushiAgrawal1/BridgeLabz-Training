package com.csv_practice.IntermediateProblems;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class FilterStudentsByMarks {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csv-practice\\src\\main\\java\\com\\csv_practice\\BasicProblems\\students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            String[] data;
            reader.readNext(); // skip header

            System.out.println("Students scoring more than 80 marks:");
            System.out.println("-----------------------------------");

            while ((data = reader.readNext()) != null) {

                // Skip empty rows
                if (data.length == 0 || data[0].trim().isEmpty()) {
                    continue;
                }

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                int marks = Integer.parseInt(data[3].trim());

                if (marks > 80) {
                    System.out.println("ID    : " + id);
                    System.out.println("Name  : " + name);
                    System.out.println("Age   : " + age);
                    System.out.println("Marks : " + marks);
                    System.out.println("-------------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

