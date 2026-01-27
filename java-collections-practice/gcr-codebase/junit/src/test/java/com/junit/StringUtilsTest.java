package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    // 🔹 reverse() tests
    @Test
    void testReverse() {
        assertEquals("olleH", stringUtils.reverse("Hello"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void testReverseNull() {
        assertNull(stringUtils.reverse(null));
    }

    // 🔹 isPalindrome() tests
    @Test
    void testIsPalindromeTrue() {
        assertTrue(stringUtils.isPalindrome("madam"));
    }

    @Test
    void testIsPalindromeCaseInsensitive() {
        assertTrue(stringUtils.isPalindrome("MadAm"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void testIsPalindromeNull() {
        assertFalse(stringUtils.isPalindrome(null));
    }

    // 🔹 toUpperCase() tests
    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }

    @Test
    void testToUpperCaseAlreadyUpper() {
        assertEquals("JAVA", stringUtils.toUpperCase("JAVA"));
    }

    @Test
    void testToUpperCaseNull() {
        assertNull(stringUtils.toUpperCase(null));
    }
}

