package com.polymorphism.assignment3.Q6;

public class SavingAccount extends GeneralAccount{
 
	int savingBalance;
	void dislplayBalance(int depositAmount) {
		super.displayBalance(depositAmount);
		this.savingBalance = this.balance + depositAmount;
		System.out.println("Saving Balance " +this.savingBalance);
	}
}
