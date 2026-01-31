package com.Functional_Interfaces;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        int limit = 20;

        // Function to get string length
        Function<String, Integer> lengthFunction =
                msg -> msg.length();

        String message = "Appointment confirmed";

        if (lengthFunction.apply(message) > limit) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message within limit");
        }
    }
}
