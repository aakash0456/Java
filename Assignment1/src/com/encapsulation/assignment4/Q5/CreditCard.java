package com.encapsulation.assignment4.Q5;

public class CreditCard {
	 private String cardNumber;
	    private double creditLimit;
	    private double currentUsage;
		public String getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
		public double getCreditLimit() {
			return creditLimit;
		}
		public void setCreditLimit(double creditLimit) {
			this.creditLimit = creditLimit;
		}
		public double getCurrentUsage() {
			return currentUsage;
		}
		public void setCurrentUsage(double currentUsage) {
			this.currentUsage = currentUsage;
		}
	   
	    void allowUse(int amount) {
	    	if( this.creditLimit > this.currentUsage + amount) {
	    		System.out.println("Allowed");
	    	}
	    	else {
	    		System.out.println("Not Allowed");
	    	}
	    }
}
