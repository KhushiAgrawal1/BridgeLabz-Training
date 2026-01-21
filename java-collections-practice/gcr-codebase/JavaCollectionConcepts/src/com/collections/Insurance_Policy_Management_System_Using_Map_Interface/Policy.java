package com.collections.Insurance_Policy_Management_System_Using_Map_Interface;

import java.time.LocalDate;

public class Policy {

    int policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    Policy(int policyNumber, String policyHolderName,
           LocalDate expiryDate, String coverageType, double premiumAmount) {

        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | " +
               expiryDate + " | " + coverageType + " | ₹" + premiumAmount;
    }
}

