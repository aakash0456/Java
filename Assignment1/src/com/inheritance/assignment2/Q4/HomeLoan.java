package com.inheritance.assignment2.Q4;

public class HomeLoan extends Loan{
	
	int interestRate = 11;
	
	int totalPay = amount + (amount*interestRate*tenure)/100;
	
	
	void showLoan() {
		System.out.println("Loan AMount " +totalPay);
	}
}
