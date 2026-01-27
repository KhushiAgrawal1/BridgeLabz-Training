package com.junit;

public class DatabaseConnection {

    private boolean connected = false;

    // Simulate database connection
    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    // Simulate database disconnection
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    public boolean isConnected() {
        return connected;
    }
}

