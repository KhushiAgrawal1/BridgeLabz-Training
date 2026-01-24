package com.exceptions;

import java.io.*;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        String fileName = "data.txt";

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("File contents:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            // User-friendly message
            System.out.println("File not found");
        }
    }
}

