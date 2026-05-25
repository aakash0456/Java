package com.polymorphism.assignment3.Q1;

public class BankingSystem {
	
int balance;

void calculateBalance(int initialAmount) {
	  this.balance = initialAmount;
	  System.out.println("Balance is " + balance);
}

void calculateBalance(int currentBalance, int depositAmount) {
	this.balance = currentBalance + depositAmount;
	System.out.println("Balance is " + balance);
}


void calculateBalance(int currentBalance, int depositAmount, int interestRate) {
	this.balance = currentBalance + depositAmount + (depositAmount + interestRate)/100;
	System.out.println("Balance is " + balance);
}

}
