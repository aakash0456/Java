package com.constructors.assignment5.Q3;

public class AccountSystem {
	
	public static void main(String[] args) {
		Account ac1 = new Account("Saving");
		Account  ac2= new Account("Current", 1000);
		
		
		ac1.displayDetails();
		ac2.displayDetails();
	}

}
