package com.constructors.assignment5.Q3;

public class Account {
	
	private String accountType;
	private int balance;
	
	public Account(String type) {
		this.accountType = type;
		this.balance = 0;
	}
    
	public Account(String type, int balance) {
		this.accountType = type;
		this.balance = balance;
		
		
	}
	
	
	public void displayDetails() {
		System.out.println("Accout Type " + accountType);
		System.out.println("Balance is " +balance);
	}
	
}
