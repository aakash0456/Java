package com.polymorphism.assignment3.Q6;

public class GeneralAccount {
  int accountNo;
  int balance;
  
  void displayBalance(int initialDeposit) {
	  this.balance = initialDeposit;
	System.out.println("General Balance is "+balance);
	  
  }
}
