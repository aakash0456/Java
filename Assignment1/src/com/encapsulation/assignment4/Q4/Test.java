package com.encapsulation.assignment4.Q4;

public class Test {
public static void main(String[] args) {
	Claim c = new Claim();
	
	c.setClaimStatus("123");
	c.setClaimStatus("Pending");
	c.setClaimAmount(10000);
	c.setPolicyNumber("111");
	
	c.approveClaim();
	c.rejectClaim();
	
}
}
