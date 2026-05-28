package com.constructors.assignment5.Q1;

public class BankAccount {
	
	private int accountNo;
	private String accountHolderName;
	private int balance;
	public BankAccount(int accountNo, String accountHolderName, int balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	
	public void displayDetails() {
		System.out.println("Accout No" +accountNo);
		System.out.println("Accout Holder Name" +accountHolderName);
		System.out.println("Balance is " +balance);
	}
	

}
