package com.streams;

import java.io.*;

public class UppercaseToLowercase {

    public static void main(String[] args) {

        String sourceFile = "input.txt";
        String destFile = "output.txt";

        // Try-with-resources for auto closing
        try (
            FileReader fr = new FileReader(sourceFile);  
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(destFile);  
            BufferedWriter bw = new BufferedWriter(fw);
        ) {

            int ch;

            // Read character by character
            while ((ch = br.read()) != -1) {
                char c = (char) ch;

                // Convert uppercase to lowercase
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }

                bw.write(c);
            }

            System.out.println("File converted successfully!");
            System.out.println("Uppercase letters converted to lowercase.");

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}

