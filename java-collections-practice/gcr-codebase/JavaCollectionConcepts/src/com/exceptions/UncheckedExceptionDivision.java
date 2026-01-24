package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionDivision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num1 = sc.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;   // may throw ArithmeticException

            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e) {
            // Division by zero
            System.out.println("Arithmetic Error: Division by zero is not allowed!");
        } 
        catch (InputMismatchException e) {
            // Non-numeric input
            System.out.println("Input Error: Please enter numeric values only!");
        } 
        finally {
            sc.close();  // Proper resource closing
        }
    }
}


