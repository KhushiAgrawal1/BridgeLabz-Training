package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

        String filePath = "example.txt"; // File to be read

        try {
            // Create FileReader
            FileReader fileReader = new FileReader(filePath);

            // Wrap FileReader with BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

