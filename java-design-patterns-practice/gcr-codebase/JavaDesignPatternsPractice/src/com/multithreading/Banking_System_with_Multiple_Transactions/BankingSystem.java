package com.multithreading.Banking_System_with_Multiple_Transactions;

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Create transaction tasks
        Transaction t1 = new Transaction(account, "Customer-1", 3000);
        Transaction t2 = new Transaction(account, "Customer-2", 4000);
        Transaction t3 = new Transaction(account, "Customer-3", 2000);
        Transaction t4 = new Transaction(account, "Customer-4", 5000);
        Transaction t5 = new Transaction(account, "Customer-5", 1500);

        // Create threads
        Thread th1 = new Thread(t1, "Thread-1");
        Thread th2 = new Thread(t2, "Thread-2");
        Thread th3 = new Thread(t3, "Thread-3");
        Thread th4 = new Thread(t4, "Thread-4");
        Thread th5 = new Thread(t5, "Thread-5");

        // Display thread state before starting
        System.out.println("Thread states before start:");
        System.out.println(th1.getName() + " - " + th1.getState());
        System.out.println(th2.getName() + " - " + th2.getState());
        System.out.println(th3.getName() + " - " + th3.getState());
        System.out.println(th4.getName() + " - " + th4.getState());
        System.out.println(th5.getName() + " - " + th5.getState());

        // Start threads
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
