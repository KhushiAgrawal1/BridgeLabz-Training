package com.exceptions;

import java.util.Scanner;

public class NestedTryCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Example array
            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter index of element: ");
            int index = sc.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            // Outer try for ArrayIndexOutOfBoundsException
            try {
                int value = arr[index];  // May throw ArrayIndexOutOfBoundsException

                // Inner try for ArithmeticException
                try {
                    int result = value / divisor;  // May throw ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {
            System.out.println("Input error! Please enter valid integers.");
        } finally {
            sc.close();
        }
    }
}

