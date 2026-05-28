package com.constructors.assignment5.Q10;

public class BankAccount {
	
	 private String name;
	    private String accountType;
	    private double balance;

	    
	    public BankAccount(String name) {
	        this.name = name;
	        this.accountType = "Savings"; 
	        this.balance = 500.0;        
	    }

	    
	    public BankAccount(String name, String accountType, double balance) {
	        
	        this(name); 
	        
	       
	        this.accountType = accountType;
	        this.balance = balance;
	    }

	    
	    public void displayDetails() {
	        System.out.println("Name: " + this.name);
	        System.out.println("Type: " + this.accountType);
	        System.out.println("Balance: " + this.balance);
	    }

}
