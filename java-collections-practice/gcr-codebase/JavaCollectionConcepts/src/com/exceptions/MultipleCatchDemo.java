package com.exceptions;

import java.util.Scanner;

public class MultipleCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // You can comment this line to test NullPointerException
            int[] arr = {10, 20, 30, 40, 50};

            // Uncomment below line to test NullPointerException
            // int[] arr = null;

            System.out.print("Enter index number: ");
            int index = sc.nextInt();

            int value = arr[index];   // may throw exceptions

            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        finally {
            sc.close();
        }
    }
}
