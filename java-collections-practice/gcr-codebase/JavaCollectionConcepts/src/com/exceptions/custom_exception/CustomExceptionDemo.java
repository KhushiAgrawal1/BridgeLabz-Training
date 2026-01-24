package com.exceptions.custom_exception;

import java.util.Scanner;

public class CustomExceptionDemo {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateAge(age);   // method call

            // If no exception
            System.out.println("Access granted!");

        } 
        catch (InvalidAgeException e) {
            // Custom exception handling
            System.out.println(e.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
