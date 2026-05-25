package com.polymorphism.assignment3.Q7;

public class HealthInsurance extends InsurancePolicy{
	String networkType; // e.g., HMO, PPO

    HealthInsurance(String policyNumber, String holderName, String networkType) {
        super(policyNumber, holderName);
        this.networkType = networkType;
    }

    
    void displayPolicyDetails() {
        System.out.println("--- Health Insurance Policy ---");
        super.displayPolicyDetails();
        System.out.println("Network Type: " + networkType);
    }
}
