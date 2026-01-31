package com.Static_Methods_in_Interfaces.Password_Strength_Validator;

public class InsurancePortal {
    public static void main(String[] args) {

        String password = "Secure123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password is strong");
        } else {
            System.out.println("Password is weak");
        }
    }
}
