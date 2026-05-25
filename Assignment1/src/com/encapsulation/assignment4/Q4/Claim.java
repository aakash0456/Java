package com.encapsulation.assignment4.Q4;

public class Claim {
	
	 private String claimId;
	    private String policyNumber;
	    private double claimAmount;
	    private String claimStatus;
		public String getClaimId() {
			return claimId;
		}
		public void setClaimId(String claimId) {
			this.claimId = claimId;
		}
		public String getPolicyNumber() {
			return policyNumber;
		}
		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}
		public double getClaimAmount() {
			return claimAmount;
		}
		public void setClaimAmount(double claimAmount) {
			this.claimAmount = claimAmount;
		}
		public String getClaimStatus() {
			return claimStatus;
		}
		public void setClaimStatus(String claimStatus) {
			this.claimStatus = claimStatus;
		}
	    
		public void approveClaim() {
	        if (this.claimStatus.equals("Pending")) {
	            this.claimStatus = "Approved";
	            System.out.println("Claim " + claimId + " has been successfully APPROVED.");
	        } else {
	            System.out.println("Error: Cannot approve. Claim is already " + claimStatus + ".");
	        }
	    }
		
		public void rejectClaim() {
	        if (this.claimStatus.equals("Pending")) {
	            this.claimStatus = "Rejected";
	            System.out.println("Claim " + claimId + " has been REJECTED.");
	        } else {
	            System.out.println("Error: Cannot reject. Claim is already " + claimStatus + ".");
	        }
	    }

}
