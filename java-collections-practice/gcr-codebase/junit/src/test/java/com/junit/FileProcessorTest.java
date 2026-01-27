package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FileProcessorTest {

    FileProcessor fileProcessor = new FileProcessor();

    // JUnit provides a temporary directory
    @TempDir
    Path tempDir;

    // ✅ Content written and read correctly
    @Test
    void testWriteAndReadFile() throws IOException {
        Path file = tempDir.resolve("test.txt");
        String content = "Hello File Test";

        fileProcessor.writeToFile(file, content);
        String result = fileProcessor.readFromFile(file);

        assertEquals(content, result);
    }

    // ✅ File exists after writing
    @Test
    void testFileExistsAfterWrite() throws IOException {
        Path file = tempDir.resolve("exists.txt");

        fileProcessor.writeToFile(file, "Check existence");

        assertTrue(Files.exists(file));
    }

    // ✅ IOException when file does not exist
    @Test
    void testReadFileDoesNotExist() {
        Path file = tempDir.resolve("missing.txt");

        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile(file);
        });
    }
}

