package com.regex;

import java.util.regex.*;

public class CreditCardValidator {
    public static void main(String[] args) {

        String[] cards = {
            "4123456789012345",  // Visa
            "5123456789012345",  // MasterCard
            "6123456789012345",  // Invalid
            "412345678901234",   // Invalid (15 digits)
            "51234567890123456"  // Invalid (17 digits)
        };

        // Regex for Visa & MasterCard
        String regex = "^(4\\d{15}|5\\d{15})$";

        Pattern pattern = Pattern.compile(regex);

        for (String card : cards) {
            System.out.println(card + " → " + pattern.matcher(card).matches());
        }
    }
}
