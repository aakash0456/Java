package com.polymorphism.assignment3.Q2;

public class InsuranceSystem {
  
	int premiumAmount;
	
	void calculateInsurancePremium(int defaultAmount) {
		this.premiumAmount = defaultAmount;
		
		System.out.println("Premium Amount = "+premiumAmount);
	}
	void calculateInsurancePremium(int defaultAmount, int age) {
		if (age > 35) {
			defaultAmount = defaultAmount + 3000;
		}
		
		this.premiumAmount = defaultAmount;
		System.out.println("Premium Amount = "+premiumAmount);
	}
	
	void calculateInsurancePremium(int defaultAmount, int age, int policyType) {
		if (age > 35) {
			defaultAmount = defaultAmount + 3000;
		}
		if (policyType  == 1) {
			defaultAmount = defaultAmount - 1000;
		}
		
		this.premiumAmount = defaultAmount;
		System.out.println("Premium Amount = "+premiumAmount);
	}
	
	void calculateInsurancePremium(int defaultAmount, int age, int policyType, int coverageAmount) {
		if (age > 35) {
			defaultAmount = defaultAmount + 3000;
		}
		if (policyType  == 1) {
			defaultAmount = defaultAmount - 1000;
		}
		
		this.premiumAmount = defaultAmount + coverageAmount;
		System.out.println("Premium Amount = "+premiumAmount);
	}
	
}
