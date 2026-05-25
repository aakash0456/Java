package com.polymorphism.assignment3.Q7;

public class InsurancePolicy {
	String policyNumber;
    String holderName;

    InsurancePolicy(String policyNumber, String holderName) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
    }

    // Method to be overridden
    void displayPolicyDetails() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Policy Holder: " + holderName);
    }
}
