package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    // ✅ Valid user registration
    @Test
    void testValidUserRegistration() {
        assertTrue(
            registration.registerUser(
                "john_doe",
                "john@example.com",
                "Password1"
            )
        );
    }

    // ❌ Invalid username
    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                "",
                "john@example.com",
                "Password1"
            );
        });
    }

    // ❌ Invalid email
    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                "john_doe",
                "johnexample.com",
                "Password1"
            );
        });
    }

    // ❌ Invalid password
    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                "john_doe",
                "john@example.com",
                "pass"
            );
        });
    }

    // ❌ Null values
    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, null, null);
        });
    }
}
