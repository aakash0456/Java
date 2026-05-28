package com.constructors.assignment5.Q4;

public class Loan {
	
	private int loanAmount;
	private int interestRate;
	private int tenure;
	public Loan(int loanAmount, int interestRate, int tenure) {
		super();
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.tenure = tenure;
	}
	
	
	public void displayDetails() {
		System.out.println("Loan Amount "+loanAmount);
		System.out.println("Interest Rate "+interestRate);
		System.out.println("Tenure is  "+tenure);
	}
	

}
