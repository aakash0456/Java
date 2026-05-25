package com.polymorphism.assignment3.Q7;

public class VehicleInsurance extends InsurancePolicy{
	String vehicleNumber;

    VehicleInsurance(String policyNumber, String holderName, String vehicleNumber) {
        super(policyNumber, holderName);
        this.vehicleNumber = vehicleNumber;
    }

    
    void displayPolicyDetails() {
        System.out.println("--- Vehicle Insurance Policy ---");
        super.displayPolicyDetails();
        System.out.println("Vehicle Number: " + vehicleNumber);
    }
}
