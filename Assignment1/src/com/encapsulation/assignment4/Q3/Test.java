package com.encapsulation.assignment4.Q3;

public class Test {

	
	public static void main(String[] args) {
		
		InsurancePolicy ip = new InsurancePolicy();
		ip.setPolicyHolderName("John");
		ip.setPolicyId(1);
		ip.setPolicyStatus(1);
		ip.setPremiumAmount(10000);
		
		ip.updatePremium(50000);
		System.out.println("New primium is" +ip.getPremiumAmount());
	}
}
