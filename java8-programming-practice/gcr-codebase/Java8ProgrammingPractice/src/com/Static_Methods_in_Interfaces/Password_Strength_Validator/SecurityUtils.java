package com.Static_Methods_in_Interfaces.Password_Strength_Validator;

interface SecurityUtils {

    static boolean isStrongPassword(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
        }

        return hasUpper && hasLower && hasDigit;
    }
}
