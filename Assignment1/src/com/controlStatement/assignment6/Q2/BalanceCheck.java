package com.controlStatement.assignment6.Q2;

import java.util.Scanner;

public class BalanceCheck {
	
	void validate() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the balance.");
		int balance  = sc.nextInt();
		
		int minBalance = 500;
		
		if(balance < minBalance) {
			System.out.println("Cant accept it.");
		}
		
		
	}

}
