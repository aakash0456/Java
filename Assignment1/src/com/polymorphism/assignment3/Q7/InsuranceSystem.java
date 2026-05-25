package com.polymorphism.assignment3.Q7;

public class InsuranceSystem {
	public static void main(String[] args) {
        // Creating instances of child classes
        InsurancePolicy health = new HealthInsurance("HI-987", "John Doe", "PPO");
        InsurancePolicy vehicle = new VehicleInsurance("VI-456", "Jane Smith", "ABC-1234");

        // Demonstrating method overriding
        health.displayPolicyDetails();
        System.out.println(); // Space for readability
        vehicle.displayPolicyDetails();
    }
}
