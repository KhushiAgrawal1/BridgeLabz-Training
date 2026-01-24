package com.exceptions;

public class ExceptionPropagationDemo {

    // method1 throws ArithmeticException
    public static void method1() {
        int result = 10 / 0;  // ArithmeticException occurs here
        System.out.println("Result: " + result);
    }

    // method2 calls method1
    public static void method2() {
        method1();  // Exception propagates to here
    }

    public static void main(String[] args) {

        try {
            method2();  // Exception propagates from method1 → method2 → main
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

