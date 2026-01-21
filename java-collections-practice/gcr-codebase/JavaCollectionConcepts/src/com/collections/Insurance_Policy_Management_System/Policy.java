package com.collections.Insurance_Policy_Management_System;

import java.time.LocalDate;

class Policy implements Comparable<Policy> {

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

    // HashSet & LinkedHashSet uniqueness based on policy number
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy other = (Policy) obj;
        return this.policyNumber == other.policyNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(policyNumber);
    }

    // TreeSet sorting by expiry date
    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | " +
               expiryDate + " | " + coverageType + " | ₹" + premiumAmount;
    }
}

