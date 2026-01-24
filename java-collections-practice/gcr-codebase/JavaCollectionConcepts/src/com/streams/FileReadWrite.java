package com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Source file
            File sourceFile = new File("source.txt");

            // Check if source file exists
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist!");
                return;
            }

            // Destination file
            File destFile = new File("destination.txt");

            // Create destination file if not exists
            if (!destFile.exists()) {
                destFile.createNewFile();
            }

            // Streams
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } 
        finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing files");
            }
        }
    }
}


