package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {

    DatabaseConnection dbConnection;

    // 🔹 Runs BEFORE each test
    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    // 🔹 Runs AFTER each test
    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testDatabaseIsConnected() {
        assertTrue(dbConnection.isConnected());
    }

    @Test
    void testDatabaseIsDisconnectedAfterTest() {
        assertTrue(dbConnection.isConnected());
    }
}

