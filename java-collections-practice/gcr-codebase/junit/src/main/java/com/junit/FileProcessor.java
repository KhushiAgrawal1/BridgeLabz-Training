package com.junit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessor {

    // Write content to file
    public void writeToFile(Path filePath, String content) throws IOException {
        Files.write(filePath, content.getBytes());
    }

    // Read content from file
    public String readFromFile(Path filePath) throws IOException {
        return new String(Files.readAllBytes(filePath));
    }
}

