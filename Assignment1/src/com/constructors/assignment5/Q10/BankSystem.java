package com.constructors.assignment5.Q10;

public class BankSystem {

	
	public static void main(String[] args) {
		 BankAccount acc1 = new BankAccount("Alice");
	        acc1.displayDetails();

	       
	        BankAccount acc2 = new BankAccount("Bob", "Current", 1500.0);
	        acc2.displayDetails();
	}
}
