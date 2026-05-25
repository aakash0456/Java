package com.encapsulation.assignment4.Q1;

public class Test {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		b.setAccountNo(100);
		b.setName("John");
		b.setBalance(100000);
		
		b.deposit(19999);
		System.out.println("Updated balance is" +b.getBalance());
		b.withdrawal(10000);
		System.out.println("Updated balance is" +b.getBalance());
	}
	
	
	
}
