package com.RuntimeAnalysisAndBigONotation;

import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileReadingPerformance {

    // ---------- Using FileReader ----------
    static void readUsingFileReader(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        while (reader.read() != -1) {
            // reading character by character
        }
        reader.close();
    }

    // ---------- Using InputStreamReader ----------
    static void readUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(filePath));
        while (reader.read() != -1) {
            // reading bytes and converting to characters
        }
        reader.close();
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        // Change this path to a large file on your system
        String filePath = "largefile.txt";

        long start, end;

        try {
            // FileReader
            start = System.currentTimeMillis();
            readUsingFileReader(filePath);
            end = System.currentTimeMillis();
            System.out.println("FileReader Time: " + (end - start) + " ms");

            // InputStreamReader
            start = System.currentTimeMillis();
            readUsingInputStreamReader(filePath);
            end = System.currentTimeMillis();
            System.out.println("InputStreamReader Time: " + (end - start) + " ms");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

