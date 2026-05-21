package com.java.inheritance.assignment2.Q1;

public class SavingAccount extends Account{
	
	int interestRate = 10;
	int intAmount;
	void calInterest() {
		intAmount = (balance*interestRate)/100;
	}
	
	void showInterest() {
		System.out.println("Interest Amount" +intAmount);
	}

}
