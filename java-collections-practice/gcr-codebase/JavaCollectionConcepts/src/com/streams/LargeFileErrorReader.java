package com.streams;

import java.io.*;

public class LargeFileErrorReader {

    public static void main(String[] args) {

        String filePath = "largefile.txt";   // Large file (500MB+)

        try (
            BufferedReader br = new BufferedReader(new FileReader(filePath))
        ) {

            String line;
            long lineCount = 0;
            long errorCount = 0;

            System.out.println("Reading file and filtering 'error' lines...\n");

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Case-insensitive search
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                    errorCount++;
                }
            }

            System.out.println("\n========= SUMMARY =========");
            System.out.println("Total lines read   : " + lineCount);
            System.out.println("Total error lines  : " + errorCount);

        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}

