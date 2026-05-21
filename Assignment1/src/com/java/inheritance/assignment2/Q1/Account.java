package com.java.inheritance.assignment2.Q1;

public class Account {
  
	int accountno =1234;
	String name = "Akash";
	int balance   =100;
	
	 void depositAmount(int deposit) {
		balance+=deposit;
	}
	
	void showBalance() {
		System.out.println("Balance is "+balance);
	}
	
	
	
}
