package com.inheritance.assignment2.Q1;

public class ShowAccount {
	
	public static void main(String[] args) {
		
		Account ac = new Account();
		  SavingAccount sv = new SavingAccount();
		  
		  ac.depositAmount(200);
		  ac.showBalance();
		  sv.calInterest();
		  sv.showInterest();
		
	}
	
  
  
}
