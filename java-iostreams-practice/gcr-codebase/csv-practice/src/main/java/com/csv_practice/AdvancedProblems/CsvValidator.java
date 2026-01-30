package com.csv_practice.AdvancedProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class CsvValidator {

    // Email regex
    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Phone regex (exactly 10 digits)
    private static final String PHONE_REGEX = "\\d{10}";

    public static void main(String[] args) {

        String filePath = "C:\\Users\\agraw\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csv-practice\\src\\main\\java\\com\\csv_practice\\AdvancedProblems\\data.csv";

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int rowNumber = 0;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                rowNumber++;
                String[] columns = line.split(",");

                String email = columns[2];
                String phone = columns[3];

                boolean valid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Row " + rowNumber +
                            " ❌ Invalid Email: " + email);
                    valid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Row " + rowNumber +
                            " ❌ Invalid Phone: " + phone);
                    valid = false;
                }

                if (!valid) {
                    System.out.println("Invalid Row Data → " + line);
                    System.out.println("----------------------------------");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
