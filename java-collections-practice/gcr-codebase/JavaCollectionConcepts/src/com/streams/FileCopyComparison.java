package com.streams;

import java.io.*;

public class FileCopyComparison {

    private static final int BUFFER_SIZE = 4096; // 4 KB buffer

    public static void main(String[] args) {

        String sourceFile = "largefile.dat";        // Example: 100MB file
        String unbufferedDest = "copy_unbuffered.dat";
        String bufferedDest = "copy_buffered.dat";

        // Unbuffered copy
        long unbufferedTime = copyUsingUnbufferedStreams(sourceFile, unbufferedDest);

        // Buffered copy
        long bufferedTime = copyUsingBufferedStreams(sourceFile, bufferedDest);

        System.out.println("\n====== PERFORMANCE RESULT ======");
        System.out.println("Unbuffered Streams Time : " + unbufferedTime + " ns");
        System.out.println("Buffered Streams Time   : " + bufferedTime + " ns");

        if (bufferedTime < unbufferedTime) {
            System.out.println("Buffered streams are faster ✅");
        } else {
            System.out.println("Unbuffered streams are faster ❗ (rare case)");
        }
    }

    // -------- Unbuffered Streams --------
    public static long copyUsingUnbufferedStreams(String source, String dest) {
        long startTime = 0;
        long endTime = 0;

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            startTime = System.nanoTime();

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            endTime = System.nanoTime();

            System.out.println("Unbuffered copy completed.");

        } catch (IOException e) {
            System.out.println("Unbuffered Error: " + e.getMessage());
        }

        return endTime - startTime;
    }

    // -------- Buffered Streams --------
    public static long copyUsingBufferedStreams(String source, String dest) {
        long startTime = 0;
        long endTime = 0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            startTime = System.nanoTime();

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            endTime = System.nanoTime();

            System.out.println("Buffered copy completed.");

        } catch (IOException e) {
            System.out.println("Buffered Error: " + e.getMessage());
        }

        return endTime - startTime;
    }
}

