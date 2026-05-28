package com.constructors.assignment5.Q2;

public class Bank {
	
	private int account ;
	private String name;
	private int balance;
	
	public Bank() {
		
		this.account = 0000;
		this.name = "abcd";
		this.balance = 100;
	}
	
	public void displayDetails() {
		System.out.println("Account is "+this.account);
		System.out.println("Name is "+this.name);
		System.out.println("Balance is "+this.balance);
	}

}
