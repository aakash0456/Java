package com.encapsulation.assignment4.Q1;

public class BankAccount {
private int accountNo;
private String name;
private int balance;
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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

 
 public void withdrawal(int withdrawAmount) {
	 this.balance = this.balance - withdrawAmount;
 }
}
