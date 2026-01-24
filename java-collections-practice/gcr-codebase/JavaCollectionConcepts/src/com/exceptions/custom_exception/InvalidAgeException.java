package com.exceptions.custom_exception;

public class InvalidAgeException extends Exception {

    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}

