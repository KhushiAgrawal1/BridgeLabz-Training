package InputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderExample {

    public static void main(String[] args) {

        String filePath = "example.txt"; // Binary encoded text file

        try {
            // Create FileInputStream (byte stream)
            FileInputStream fis = new FileInputStream(filePath);

            // Convert byte stream to character stream using UTF-8
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

            // Wrap InputStreamReader with BufferedReader
            BufferedReader br = new BufferedReader(isr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

