package com.polymorphism.assignment3.Q2;

public class Test {
	
	
	public static void main(String[] args) {
		InsuranceSystem ins = new InsuranceSystem();
		  
		ins.calculateInsurancePremium(10000);
		ins.calculateInsurancePremium(10000, 45);
		ins.calculateInsurancePremium(10000, 34, 1);
		ins.calculateInsurancePremium(10000, 20, 1, 5000);
	}
  
}
