package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    // ✅ Valid date test
    @Test
    void testValidDate() {
        String result = formatter.formatDate("2024-02-15");
        assertEquals("15-02-2024", result);
    }

    // ❌ Invalid date format
    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("15-02-2024");
        });
    }

    // ❌ Invalid date value
    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2024-02-30");
        });
    }

    // ❌ Null input
    @Test
    void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
    }
}

