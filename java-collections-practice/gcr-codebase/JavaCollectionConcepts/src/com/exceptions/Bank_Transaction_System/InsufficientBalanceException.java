package com.exceptions.Bank_Transaction_System;

//Custom checked exception
public class InsufficientBalanceException extends Exception {
 
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

