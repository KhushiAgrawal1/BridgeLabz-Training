package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        String fileName = "info.txt";

        // try-with-resources (auto closes BufferedReader)
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String firstLine = br.readLine();

            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }

        } catch (IOException e) {
            // User-friendly error message
            System.out.println("Error reading file");
        }
    }
}

