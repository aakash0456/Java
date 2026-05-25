package com.encapsulation.assignment4.Q5;

public class Test {

	
	public static void main(String[] args) {
		CreditCard c = new CreditCard();
		c.setCardNumber("1234");
		c.setCreditLimit(100000);
		c.setCurrentUsage(11000);
		
		c.allowUse(1000);
	}
}
