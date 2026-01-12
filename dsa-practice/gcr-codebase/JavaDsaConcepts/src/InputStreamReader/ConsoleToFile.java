package InputStreamReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleToFile {

    public static void main(String[] args) {

        String filePath = "output.txt";

        try {
            // Read input from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Write output to file
            FileWriter writer = new FileWriter(filePath);

            String input;

            System.out.println("Enter text (type 'exit' to stop):");

            // Read until user enters "exit"
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Write input to file as new line
                writer.write(input + System.lineSeparator());
            }

            // Close resources
            writer.close();
            br.close();

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

