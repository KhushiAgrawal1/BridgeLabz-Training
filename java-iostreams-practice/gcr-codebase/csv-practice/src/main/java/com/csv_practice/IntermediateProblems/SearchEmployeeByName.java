package com.csv_practice.IntermediateProblems;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchEmployeeByName {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csv-practice\\src\\main\\java\\com\\csv_practice\\BasicProblems\\employees.csv";
        boolean found = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine().trim();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            String[] data;
            reader.readNext(); // skip header

            while ((data = reader.readNext()) != null) {

                // Skip empty rows
                if (data.length == 0 || data[0].trim().isEmpty()) {
                    continue;
                }

                String name = data[1].trim();

                // Case-insensitive search
                if (name.equalsIgnoreCase(searchName)) {

                    String department = data[2].trim();
                    String salary = data[3].trim();

                    System.out.println("\nEmployee Found!");
                    System.out.println("Name       : " + name);
                    System.out.println("Department : " + department);
                    System.out.println("Salary     : " + salary);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nEmployee not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}

