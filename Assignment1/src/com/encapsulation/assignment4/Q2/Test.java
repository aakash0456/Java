package com.encapsulation.assignment4.Q2;

import com.encapsulation.assignment4.Q1.BankAccount;

public class Test {
	
	public static void main(String[] args) {
		ATM a = new ATM();
		
		a.setName("John");
		a.setBalance(100000);
		a.setCardNo(12345);
		a.setPin(1111);
		
		
		a.deposit(100000);
		System.out.println("Balance is "+a.getBalance());
		a.withdrawal(3000, 1111);
		System.out.println("Balance is "+a.getBalance());
		
		
		
	}
	
}
