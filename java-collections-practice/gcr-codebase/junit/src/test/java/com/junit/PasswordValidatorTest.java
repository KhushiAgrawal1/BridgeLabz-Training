package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    // ✅ Valid passwords
    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("StrongPass9"));
    }

    // ❌ Less than 8 characters
    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("Pass1"));
    }

    // ❌ No uppercase letter
    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    // ❌ No digit
    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    // ❌ Null password
    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}

