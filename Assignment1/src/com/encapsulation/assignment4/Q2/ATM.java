package com.encapsulation.assignment4.Q2;

public class ATM {

	private int cardNo;
	private String name;
	private int pin;
	private int balance;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public void deposit(int depositAmount) {
		 this.balance = this.balance + depositAmount;
	 }

	 
	 public void withdrawal(int withdrawAmount , int enteredPin) {
		 if (this.pin != enteredPin) {
			 System.out.println("Invalid Pin");
			
		 }
		 else {
			 this.balance = this.balance - withdrawAmount;
		 }
		 
		 
	 }
	
}
