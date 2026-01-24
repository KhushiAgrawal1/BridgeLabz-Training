package com.streams;

import java.io.*;

public class PipedStreamDemo {

    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // connect streams

            // Create threads
            Thread writerThread = new Thread(new Writer(pos));
            Thread readerThread = new Thread(new Reader(pis));

            // Start threads
            writerThread.start();
            readerThread.start();

        } catch (IOException e) {
            System.out.println("Connection Error: " + e.getMessage());
        }
    }
}

// -------- Writer Thread --------
class Writer implements Runnable {

    private PipedOutputStream pos;

    public Writer(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread! Data sent through pipe.";

            // Write data
            pos.write(message.getBytes());
            pos.close();

            System.out.println("Writer Thread: Data written successfully.");

        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

// -------- Reader Thread --------
class Reader implements Runnable {

    private PipedInputStream pis;

    public Reader(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            int data;
            StringBuilder sb = new StringBuilder();

            // Read data
            while ((data = pis.read()) != -1) {
                sb.append((char) data);
            }

            System.out.println("Reader Thread: Data received → " + sb.toString());
            pis.close();

        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}

