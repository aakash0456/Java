package com.controlStatement.assignment6.Q1;

import java.util.Scanner;

public class ATM {

	
	public void validate() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the current balance.");
		 int balance = sc.nextInt();
		 
		 System.out.println("Enter the withdrawal amount.");
		 int wbalance = sc.nextInt();
		 
		 if(wbalance > balance) {
			 System.out.println("Insufficient Balance.");
		 }else {
			 balance = balance - wbalance;
			 System.out.println("Success! Withdrawal allowed.");
			 System.out.println("Remaining Balance: " + balance);
			 
		 }
		 
	}
}
