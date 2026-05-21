package com.inheritance.assignment2.Q3;

public class HealthInsurance extends InsurancePolicy{
int hospitalLimit = 550;

void showAmount() {
	System.out.println("Amount can use "+ (policyAmount - hospitalLimit));
}
}
