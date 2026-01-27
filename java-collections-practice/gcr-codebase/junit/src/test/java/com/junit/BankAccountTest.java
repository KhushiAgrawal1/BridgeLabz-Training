package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0); // initial balance
    }

    // ✅ Test deposit
    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    // ✅ Test withdrawal
    @Test
    void testWithdraw() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    // ✅ Test insufficient balance
    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            account.withdraw(2000.0);
        });

        assertEquals("Insufficient funds", exception.getMessage());
        assertEquals(1000.0, account.getBalance()); // balance unchanged
    }

    // ✅ Test invalid deposit
    @Test
    void testInvalidDeposit() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
    }

    // ✅ Test invalid withdrawal
    @Test
    void testInvalidWithdrawal() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(0);
        });
    }
}

