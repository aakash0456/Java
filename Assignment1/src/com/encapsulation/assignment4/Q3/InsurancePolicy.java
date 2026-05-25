package com.encapsulation.assignment4.Q3;

public class InsurancePolicy {
 
	private int policyId;
	private String policyHolderName;
	private int premiumAmount;
	private int policyStatus;
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public int getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(int policyStatus) {
		this.policyStatus = policyStatus;
	}
	
	
	 public void updatePremium(int newPremium) {
	        this.premiumAmount = newPremium;
	    }

	    
	    public void changePolicyStatus(int newStatus) {
	        
	            this.policyStatus = newStatus;
	        
	    }

}
