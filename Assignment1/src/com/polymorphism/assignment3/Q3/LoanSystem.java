package com.polymorphism.assignment3.Q3;

public class LoanSystem {
	
	int EMI;
	
	void calculateEMI(int defaultEMI) {
		this.EMI = defaultEMI;
		System.out.println("EMI is "+this.EMI);
	}
	
	void calculateEMI(int defaultEMI, int interestRate) {
		this.EMI  = defaultEMI + (defaultEMI * interestRate)/100;
		System.out.println("EMI is "+this.EMI);
	}
	
	void calculateEMI(int defaultEMI, int interestRate, int tenure) {
		this.EMI  = defaultEMI + (defaultEMI * interestRate* tenure)/100;
		System.out.println("EMI is "+this.EMI);
	} 

}
